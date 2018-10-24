package de.samply.share.client.quality.report.file.excel.cell.element;/*
 * Copyright (C) 2018 Medizinische Informatik in der Translationalen Onkologie,
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

import org.apache.poi.ss.usermodel.Cell;

public class NaturalLanguageBooleanExcelCellElement extends ExcelCellElement<Boolean> {

    private NaturalLanguageBoolean booleanLanguage = NaturalLanguageBoolean.DE;

    public NaturalLanguageBooleanExcelCellElement(Boolean element) {
        super(element);
    }

    @Override
    protected Cell setCellValue(Cell cell) {

        String value = booleanLanguage.getValue(element);
        cell.setCellValue(value);

        return cell;

    }

    public void setBooleanLanguage (NaturalLanguageBoolean booleanLanguage){
        this.booleanLanguage = booleanLanguage;
    }

}