/*
 * xnat-stroke: org.nrg.xnat.stroke.plugin.StrokeXnatPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.stroke.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.StrokeEdemasamplecollectionBean;
//import org.nrg.xdat.bean.RadRadiologyreaddataBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "strokePlugin", name = "XNAT 1.7 Stroke 2016 Plugin", entityPackages = "org.nrg.xnat.stroke.entities",
            dataModels = {@XnatDataModel(value = StrokeEdemasamplecollectionBean.SCHEMA_ELEMENT_NAME,
                                         singular = "Edemasample Collection",
                                         plural = "Edemasample Collections")
                         })
//@ComponentScan({"org.nrg.xnat.stroke.subjectmapping.preferences",
//        "org.nrg.xnat.stroke.subjectmapping.repositories",
//        "org.nrg.xnat.stroke.subjectmapping.rest",
//        "org.nrg.xnat.stroke.subjectmapping.services.impl"})
public class StrokeXnatPlugin {
  //  @Bean
  //  public String strokePluginMessage() {
   //     return "";
    //}
}
