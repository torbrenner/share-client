package de.samply.share.client.quality.report.faces;/*
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

import java.util.Comparator;


public class QualityReportFileInfoComparator implements Comparator<QualityReportFileInfo> {

    @Override
    public int compare(QualityReportFileInfo o1, QualityReportFileInfo o2) {

        return  o1==null ?
                (o2==null ? 0 : Integer.MIN_VALUE) :
                (o2==null ? Integer.MAX_VALUE : o1.getTimestamp().compareTo(o2.getTimestamp()));

    }

}
