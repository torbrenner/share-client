package de.samply.share.client.quality.report.chain;

import de.samply.share.client.quality.report.MdrIgnoredElements;
import de.samply.share.client.quality.report.MdrMappedElements;
import de.samply.share.client.quality.report.chain.finalizer.ChainFinalizer;
import de.samply.share.client.quality.report.chainlinks.statistics.factory.ChainLinkStatisticsFactory;
import de.samply.share.client.quality.report.chainlinks.timer.factory.ChainLinkTimerFactory;
import de.samply.share.client.quality.report.file.manager.CsvQualityReportFileManager;
import de.samply.share.client.quality.report.file.manager.ExcelQualityReportFileManager;
import de.samply.share.client.quality.report.file.manager.QualityReportMetadataFileManager;
import de.samply.share.client.quality.report.localdatamanagement.LocalDataManagementRequester;
import de.samply.share.client.quality.report.model.Model;
import de.samply.share.client.quality.report.results.operations.QualityResultsAnalyzer;
import de.samply.share.client.quality.report.results.operations.QualityResultsValidator;
import de.samply.share.client.quality.report.views.ViewsCreator;


public class ChainParameters {

  private String fileId;
  private LocalDataManagementRequester localDataManagementRequester;
  private int maxAttempts;
  private ChainLinkTimerFactory chainLinkTimerFactory;
  private CsvQualityReportFileManager csvQualityReportFileManager;
  private ExcelQualityReportFileManager excelQualityReportFileManager;
  private Model model;
  private ViewsCreator viewsCreator;
  private QualityResultsValidator qualityResultsValidator;
  private QualityResultsAnalyzer qualityResultsAnalyzer;
  private MdrIgnoredElements ignoredElements;
  private MdrMappedElements mdrMappedElements;
  private QualityReportMetadataFileManager qualityReportMetadataFileManager;
  private ChainLinkStatisticsFactory chainLinkStatisticsFactory;
  private ChainFinalizer chainFinalizer;


  public LocalDataManagementRequester getLocalDataManagementRequester() {
    return localDataManagementRequester;
  }

  public void setLocalDataManagementRequester(
      LocalDataManagementRequester localDataManagementRequester) {
    this.localDataManagementRequester = localDataManagementRequester;
  }

  public int getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(int maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public ChainLinkTimerFactory getChainLinkTimerFactory() {
    return chainLinkTimerFactory;
  }

  public void setChainLinkTimerFactory(ChainLinkTimerFactory chainLinkTimerFactory) {
    this.chainLinkTimerFactory = chainLinkTimerFactory;
  }

  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public ViewsCreator getViewsCreator() {
    return viewsCreator;
  }

  public void setViewsCreator(ViewsCreator viewsCreator) {
    this.viewsCreator = viewsCreator;
  }

  public QualityResultsValidator getQualityResultsValidator() {
    return qualityResultsValidator;
  }

  public void setQualityResultsValidator(QualityResultsValidator qualityResultsValidator) {
    this.qualityResultsValidator = qualityResultsValidator;
  }

  public QualityResultsAnalyzer getQualityResultsAnalyzer() {
    return qualityResultsAnalyzer;
  }

  public void setQualityResultsAnalyzer(QualityResultsAnalyzer qualityResultsAnalyzer) {
    this.qualityResultsAnalyzer = qualityResultsAnalyzer;
  }

  public CsvQualityReportFileManager getCsvQualityReportFileManager() {
    return csvQualityReportFileManager;
  }

  public void setCsvQualityReportFileManager(
      CsvQualityReportFileManager csvQualityReportFileManager) {
    this.csvQualityReportFileManager = csvQualityReportFileManager;
  }

  public ExcelQualityReportFileManager getExcelQualityReportFileManager() {
    return excelQualityReportFileManager;
  }

  public void setExcelQualityReportFileManager(
      ExcelQualityReportFileManager excelQualityReportFileManager) {
    this.excelQualityReportFileManager = excelQualityReportFileManager;
  }

  public MdrIgnoredElements getIgnoredElements() {
    return ignoredElements;
  }

  public void setIgnoredElements(MdrIgnoredElements ignoredElements) {
    this.ignoredElements = ignoredElements;
  }

  public QualityReportMetadataFileManager getQualityReportMetadataFileManager() {
    return qualityReportMetadataFileManager;
  }

  public void setQualityReportMetadataFileManager(
      QualityReportMetadataFileManager qualityReportMetadataFileManager) {
    this.qualityReportMetadataFileManager = qualityReportMetadataFileManager;
  }

  public ChainLinkStatisticsFactory getChainLinkStatisticsFactory() {
    return chainLinkStatisticsFactory;
  }

  public void setChainLinkStatisticsFactory(ChainLinkStatisticsFactory chainLinkStatisticsFactory) {
    this.chainLinkStatisticsFactory = chainLinkStatisticsFactory;
  }

  public ChainFinalizer getChainFinalizer() {
    return chainFinalizer;
  }

  public void setChainFinalizer(ChainFinalizer chainFinalizer) {
    this.chainFinalizer = chainFinalizer;
  }

  public MdrMappedElements getMdrMappedElements() {
    return mdrMappedElements;
  }

  public void setMdrMappedElements(MdrMappedElements mdrMappedElements) {
    this.mdrMappedElements = mdrMappedElements;
  }

}
