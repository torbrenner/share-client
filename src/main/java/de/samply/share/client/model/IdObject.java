/*
 * Copyright (c) 2017 Medical Informatics Group (MIG),
 * Universitätsklinikum Frankfurt
 *
 * Contact: www.mig-frankfurt.de
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
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7:
 *
 * If you modify this Program, or any covered work, by linking or combining it
 * with Jersey (https://jersey.java.net) (or a modified version of that
 * library), containing parts covered by the terms of the General Public
 * License, version 2.0, the licensors of this Program grant you additional
 * permission to convey the resulting work.
 */

package de.samply.share.client.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * An ID Object, as needed to request export ids from the id manager
 */
public class IdObject {

    @JsonProperty("idType")
    private final String idType;
    @JsonProperty("idString")
    private final String idString;

    public IdObject(String idType, String idString) {
        this.idType = idType;
        this.idString = idString;
    }

    public String getIdType() {
        return idType;
    }
    public String getIdString() {
        return idString;
    }

    @Override
    public String toString() {
        return "IdObject [idType=" + idType + ", idString=" + idString + "]";
    }
}
