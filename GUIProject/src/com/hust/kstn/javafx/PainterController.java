package com.hust.kstn.javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ToggleGroup;

public class PainterController {
	private Color colorPen;

    @FXML
    private Pane drawingAreaPane;
    
    @FXML
    private ToggleGroup toolsGroup;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, colorPen);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    
    @FXML
    void penButtonPressed(ActionEvent event) {
    	colorPen = Color.BLACK;
    }

    @FXML
    void eraserButtonPressed(ActionEvent event) {
    	colorPen = Color.WHITE;
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

}
