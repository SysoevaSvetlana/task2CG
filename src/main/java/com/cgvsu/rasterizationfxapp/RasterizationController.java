package com.cgvsu.rasterizationfxapp;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;

import com.cgvsu.rasterization.*;
import javafx.scene.paint.Color;

public class RasterizationController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        Rasterization.drawLine(canvas.getGraphicsContext2D(), 100, 100, 700, 500, Color.RED, Color.BLUE);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 100, 100, 700, 100, Color.RED, Color.BLUE);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 100, 100, 100, 500, Color.RED, Color.BLUE);


    }
}