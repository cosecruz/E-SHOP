/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.config;

import com.sun.faces.config.FacesInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author EBUKA
 */

public class EshopInit extends FacesInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {

        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(EshopConfig.class, HibernateConfig.class);
        sc.addListener(new ContextLoaderListener(appContext));
    }
}
