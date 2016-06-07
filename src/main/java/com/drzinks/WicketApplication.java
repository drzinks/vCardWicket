package com.drzinks;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.drzinks.Start#main(String[])
 */
public class WicketApplication extends WebApplication  
{
	private ApplicationContext ctx;
	
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	
	@Override
	public void init()
	{
		super.init();
		System.out.println("before ");
		ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx));
		// add your configuration here
	}


}
