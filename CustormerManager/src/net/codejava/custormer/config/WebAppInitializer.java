package net.codejava.custormer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appcontext = new AnnotationConfigWebApplicationContext();
		appcontext.register(WebMvcConfig.class);
		
		ServletRegistration.Dynamic dispascher = 
				servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appcontext));
		dispascher.setLoadOnStartup(1);
		dispascher.addMapping("/");
	}

}
