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

import java.math.BigDecimal;
import java.math.RoundingMode;


public class DoubleExcelCellElement extends ExcelCellElement<Double> {

    public DoubleExcelCellElement(Double element) {
        this(element,1);
    }

    public DoubleExcelCellElement(Double element, int numberOfDecimals) {

        super(element);
        this.element = roundDouble(this.element, numberOfDecimals);

    }

    @Override
    protected Cell setCellValue(Cell cell) {

        cell.setCellValue(element);

        return cell;

    }

    private Double roundDouble (Double number, int numberOfDecimals){

        if (number != null){

            BigDecimal bd = new BigDecimal(number);
            bd = bd.setScale(numberOfDecimals, RoundingMode.HALF_UP);
            number = bd.doubleValue();

        }

        return number;

    }

}
