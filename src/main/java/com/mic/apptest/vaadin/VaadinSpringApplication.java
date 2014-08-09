/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.mic.apptest.vaadin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.vaadin.Application;


@Configurable
public class VaadinSpringApplication extends Application {
    private static final long serialVersionUID = 1L;

    public static final String APPLICATION_TITLE = "Vaadin-Spring Integration";

    @Autowired
    private MainWindow mainWindow;

    @Override
    public void init() {
        setMainWindow(mainWindow);
    }

}
