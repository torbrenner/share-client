package de.samply.share.client.quality.report.views.fromto;/*
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


import de.samply.share.client.model.EnumConfiguration;
import de.samply.share.client.quality.report.MdrIdAndValidations;
import de.samply.share.client.quality.report.MdrIgnoredElements;
import de.samply.share.client.quality.report.MdrMappedElements;
import de.samply.share.client.quality.report.model.Model;
import de.samply.share.client.quality.report.views.ViewsCreator;
import de.samply.share.client.quality.report.views.fromto.scheduler.ViewFromToScheduler;
import de.samply.share.client.util.db.ConfigurationUtil;
import de.samply.share.common.utils.MdrIdDatatype;
import de.samply.share.model.common.*;

import javax.xml.bind.JAXBElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FromToViewsCreator implements ViewsCreator{



    private ViewFromToScheduler viewFromToScheduler;
    private ObjectFactory objectFactory = new ObjectFactory();
    private MdrIgnoredElements ignoredElements;
    private MdrMappedElements mdrMappedElements;

    public FromToViewsCreator(ViewFromToScheduler viewFromToScheduler) {
        this.viewFromToScheduler = viewFromToScheduler;
    }

    @Override
    public List<View> createViews(Model model) {

        List<ViewFromTo> viewFromTos = viewFromToScheduler.createViewFromTos();
        return createViews(viewFromTos, model);

    }

    private List<View> createViews (List<ViewFromTo> viewFromTos, Model model){

        List<View> viewsList = new ArrayList<>();

        ViewFields viewFields = createViewFields(model);

        for (ViewFromTo viewFromTo : viewFromTos){

            View view = createView(viewFromTo, viewFields);
            viewsList.add(view);

        }

        return viewsList;

    }


    private ViewFields createViewFields (Model model){

        ViewFields viewFields = objectFactory.createViewFields();

        for (MdrIdAndValidations mdrIdAndValidations : model.getMdrIdAndValidations()) {

            if (!isIgnoredElement(mdrIdAndValidations.getMdrId()) && isMappedElement(mdrIdAndValidations.getMdrId())) {

                String mdrKey = getMdrKey(mdrIdAndValidations.getMdrId());
                viewFields.getMdrKey().add(mdrKey);

            }

        }

        return viewFields;

    }

    private boolean isMappedElement (MdrIdDatatype mdrId){
        return (mdrMappedElements != null) ? mdrMappedElements.isMapped(mdrId) : true;
    }

    private boolean isIgnoredElement (MdrIdDatatype mdrId){
        return (ignoredElements != null) ? ignoredElements.isIgnored(mdrId) : false;
    }

    private boolean isSameMdrId(MdrIdDatatype m1, MdrIdDatatype m2){
        return m1 != null && m2!= null && m1.getMajor().equalsIgnoreCase(m2.getMajor());
    }


    private View createView (ViewFromTo viewFromTo, ViewFields viewFields){

        Query viewFromToQuery = createViewFromToQuery(viewFromTo);
        return createView(viewFromToQuery, viewFields);

    }

    private View createView (Query query, ViewFields viewFields){

        View view = objectFactory.createView();

        view.setQuery(query);
        view.setViewFields(viewFields);

        return view;

    }

    private Query createViewFromToQuery (ViewFromTo viewFromTo){

        Attribute fromAttribute = createFromAttribute(viewFromTo);
        Attribute toAttribute = createToAttribute(viewFromTo);

        Geq geq = objectFactory.createGeq();
        geq.setAttribute(fromAttribute);

        Lt lt = objectFactory.createLt();
        lt.setAttribute(toAttribute);

        And and = objectFactory.createAnd();
        List<Serializable> andOrEqOrLike = and.getAndOrEqOrLike();
        andOrEqOrLike.add(geq);
        andOrEqOrLike.add(lt);

        Where where = objectFactory.createWhere();
        List<Serializable> andOrEqOrLike1 = where.getAndOrEqOrLike();
        andOrEqOrLike1.add(and);

        Query query = objectFactory.createQuery();
        query.setWhere(where);

        return query;

    }

    private Attribute createFromAttribute (ViewFromTo viewFromTo){


        MdrIdDatatype mdrId = getMdrKeyUploadFrom();
        return createAttribute(mdrId, viewFromTo.getFrom());

    }

    private Attribute createToAttribute (ViewFromTo viewFromTo){

        MdrIdDatatype mdrId = getMdrKeyUploadTo();
        return createAttribute(mdrId, viewFromTo.getTo());

    }

    private MdrIdDatatype getMdrKeyUploadFrom (){
        return getMdrKey(EnumConfiguration.MDR_KEY_UPLOAD_FROM);
    }

    private MdrIdDatatype getMdrKeyUploadTo(){
        return getMdrKey(EnumConfiguration.MDR_KEY_UPLOAD_TO);
    }

    private MdrIdDatatype getMdrKey (EnumConfiguration enumConfiguration){
        return new MdrIdDatatype(ConfigurationUtil.getConfigurationElementValue(enumConfiguration));
    }

    private Attribute createAttribute (MdrIdDatatype mdrId, String value){

        Attribute attribute = objectFactory.createAttribute();
        attribute.setMdrKey(getMdrKey(mdrId));

        JAXBElement<String> value1 = objectFactory.createValue(value);
        attribute.setValue(value1);

        return attribute;

    }

    private String getMdrKey(MdrIdDatatype mdrIdDatatype){
        return mdrIdDatatype.getLatestCentraxx();
    }


    public void setIgnoredElements(MdrIgnoredElements ignoredElements) {
        this.ignoredElements = ignoredElements;
    }

    public void setMdrMappedElements(MdrMappedElements mdrMappedElements) {
        this.mdrMappedElements = mdrMappedElements;
    }

}
