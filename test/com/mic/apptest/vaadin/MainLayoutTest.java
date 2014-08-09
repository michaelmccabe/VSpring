package com.mic.apptest.vaadin;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mic.apptest.vaadin.MainLayout;
import com.vaadin.ui.Label;

public class MainLayoutTest {
	
	MainLayout underTest = new MainLayout();
	
	@Test
	public void mainLayoutMustHaveALabel() throws Exception {
		
		underTest.setLabelText("");
		
		assertEquals(1, underTest.getComponentCount());
		
		assertEquals("label text",underTest.getComponent(0).getCaption());
		assertTrue(underTest.getComponent(0) instanceof Label);
		
	}
	
}
