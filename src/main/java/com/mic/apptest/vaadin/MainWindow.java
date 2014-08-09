
package com.mic.apptest.vaadin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;


@Component
public class MainWindow extends Window {
    private static final long serialVersionUID = 1L;

    private static int instanceId = 0;

    @Autowired
    private InstanceService instanceService;
    
    @Autowired
    private MainLayout mainLayout;

    public MainWindow() {
        super(VaadinSpringApplication.APPLICATION_TITLE);

        instanceId++;

        addComponent(new Label(VaadinSpringApplication.APPLICATION_TITLE));
    }

    @PostConstruct
    public void addInstanceLabels() {
        addComponent(new Label("MainWindow instanceId: " + instanceId));
        addComponent(new Label(instanceService.getInstanceText()));
        addComponent(mainLayout);
    }
}
