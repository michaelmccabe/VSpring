package com.mic.apptest.vaadin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


@Component
public class MainLayout extends VerticalLayout {
	
	private String labelText;
	
	private Label label = new Label();
	






	public String getLabelText() {
		return labelText;
	}

	


	public void setLabelText(String labelText) {
		this.labelText = labelText;
		this.label.setValue(labelText);
	}



	public MainLayout() {
		
		this.setWidth("400");
		this.setHeight("500");
		label.setWidth("300");
		this.addComponent(label);

		
		
	}



}
