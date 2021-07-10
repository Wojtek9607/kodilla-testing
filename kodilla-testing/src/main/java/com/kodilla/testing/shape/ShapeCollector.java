package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<Shape>();
    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (shapeList.size() == 0) {
            return null;
        } else {
            return shapeList.get(n);
        }
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        String sep = "";
        for(Shape s : shapeList) {
            result.append(sep);
            result.append(s.getShapeName());
            sep = ", ";
        }
        result.append(".");
        System.out.println(result.toString());
        return result.toString();
    }
}