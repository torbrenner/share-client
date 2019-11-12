package de.samply.share.client.quality.report.file.excel.sheet.wrapper;/*
* Copyright (C) 2017 Medizinische Informatik in der Translationalen Onkologie,
* Deutsches Krebsforschungszentrum in Heidelberg
*
* This program is free software; you can redistribute it and/or modify it under
* the terms of the GNU Affero General Public License as published by the Free
* Software Foundation; either version 3 of the License, or (at your option) any
* later version.
*
* This program is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
* details.
*
* You should have received a copy of the GNU Affero General Public License
* along with this program; if not, see http://www.gnu.org/licenses.
*
* Additional permission under GNU GPL version 3 section 7:
*
* If you modify this Program, or any covered work, by linking or combining it
* with Jersey (https://jersey.java.net) (or a modified version of that
* library), containing parts covered by the terms of the General Public
* License, version 2.0, the licensors of this Program grant you additional
* permission to convey the resulting work.
*/

import de.samply.share.client.quality.report.file.excel.sheet.ExcelSheetFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.HashSet;
import java.util.Set;


public class ExcelSheetWithAutoSizeColumnFactory extends ExcelSheetFactoryWrapper {

    private Set<Integer> excludedColumnsForAutoSize = new HashSet<>();
    protected static final Logger logger = LogManager.getLogger(ExcelSheetWithAutoSizeColumnFactory.class);

    public ExcelSheetWithAutoSizeColumnFactory(ExcelSheetFactory excelSheetFactory) {
        super(excelSheetFactory);
    }

    @Override
    protected XSSFSheet addFunctionalityToSheet(XSSFSheet sheet) {

        for (int i = 0; i < sheet.getRow(0).getPhysicalNumberOfCells(); i++){

            if (!excludedColumnsForAutoSize.contains(i)){
                //sheet.autoSizeColumn(i);
                autoSizeColumn(sheet, i);
            }

        }

        return sheet;
    }


    private void autoSizeColumn (XSSFSheet sheet, int column){
        try{
            sheet.autoSizeColumn(column);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }
    }

    public void addExcludedColumn (int column){
        excludedColumnsForAutoSize.add(column);
    }

}
