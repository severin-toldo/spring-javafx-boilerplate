package com.stoldo.spring_javafx_boilerplate.gui.pages.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stoldo.spring_javafx_boilerplate.service.SomeService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Component
public class SomeController {
	
//	@Autowired
//	private SomeService someService;
	
	@FXML
	private Label helloWorldLabel;
	
	@FXML
    public void initialize() {
		System.out.println("Doing setup...");
		helloWorldLabel.setText("Hello World!");
    }
}
