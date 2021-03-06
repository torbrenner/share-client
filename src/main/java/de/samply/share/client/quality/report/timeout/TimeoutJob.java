package de.samply.share.client.quality.report.timeout;

import de.samply.share.client.quality.report.chainlinks.finalizer.ChainLinkFinalizer;
import de.samply.share.client.quality.report.chainlinks.finalizer.ChainLinkFinalizerListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimeoutJob implements Runnable, ChainLinkFinalizerListener {

  private ChainLinkFinalizer chainLinkFinalizer;
  private long timeout;
  private Logger logger = LogManager.getLogger(TimeoutJob.class);
  private boolean isTimeoutReached = false;
  private boolean isChainAlreadyFinished = false;


  /**
   * Todo.
   * @param chainLinkFinalizer Todo.
   * @param timeout Todo.
   */
  public TimeoutJob(ChainLinkFinalizer chainLinkFinalizer, long timeout) {

    this.chainLinkFinalizer = chainLinkFinalizer;
    chainLinkFinalizer.addChainLinkFinalizerListener(this);

    this.timeout = timeout;
    Thread thread = new Thread(this);
    thread.start();

  }

  @Override
  public void run() {
    myWait();
  }

  private void myWait() {
    try {

      myWait_WithoutExceptionManagement();

    } catch (InterruptedException e) {

      logger.info(e);
      finalizeChain();

    }
  }

  private synchronized void myWait_WithoutExceptionManagement() throws InterruptedException {

    wait(timeout);

    if (!isChainAlreadyFinished) {

      isTimeoutReached = true;
      logTimeoutReached();
      finalizeChain();
      chainLinkFinalizer.setAtLeastOneTimeoutReached();

    }
  }

  private void logTimeoutReached() {
    logger.info("Timeout was reached by QB-Generator: ");
  }

  private void finalizeChain() {

    if (!isChainAlreadyFinished) {

      chainLinkFinalizer.finalizeAll();
      isChainAlreadyFinished = true;

    }

  }

  /**
   * Todo.
   */
  public synchronized void setChainIsAlreadyFinished() {

    isChainAlreadyFinished = true;
    notifyAll();

  }

  public boolean isTimeoutReached() {
    return isTimeoutReached;
  }


  @Override
  public void notifyIsFinished() {
    setChainIsAlreadyFinished();
  }

}
