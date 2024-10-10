package com.cgvsu.rasterization;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

public class Rasterization {


    public static void drawLine(GraphicsContext gc, int x1, int y1, int x2, int y2, Color color1, Color color2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        if (steps == 0) {
            return;
        }

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;

        float r1 = (float) color1.getRed();
        float g1 = (float) color1.getGreen();
        float b1 = (float) color1.getBlue();

        float r2 = (float) color2.getRed();
        float g2 = (float) color2.getGreen();
        float b2 = (float) color2.getBlue();

        float rIncrement = (r2 - r1) / steps;
        float gIncrement = (g2 - g1) / steps;
        float bIncrement = (b2 - b1) / steps;

        float x = x1;
        float y = y1;
        float r = r1;
        float g = g1;
        float b = b1;

        for (int i = 0; i <= steps; i++) {
            gc.setFill(Color.color(r, g, b));
            gc.fillRect(Math.round(x), Math.round(y), 1, 1);
            x += xIncrement;
            y += yIncrement;
            r += rIncrement;
            g += gIncrement;
            b += bIncrement;
        }
    }

}
