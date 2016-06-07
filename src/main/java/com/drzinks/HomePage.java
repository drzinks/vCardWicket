package com.drzinks;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.springframework.beans.factory.annotation.Autowired;

import com.drzinks.services.interfaces.HelloWorldService;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	@SpringBean
	private HelloWorldService helloWorldService;

	public HomePage(final PageParameters parameters) {
		//super(parameters);

	//	add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		add(new Label("msg","message"));

		// TODO Add your page's components here

    }
}
