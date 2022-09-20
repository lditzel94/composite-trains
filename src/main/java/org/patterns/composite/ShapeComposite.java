package org.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeComposite extends Shape {

    private List<Shape> shapes;

    public ShapeComposite() {
        this.shapes = new ArrayList<Shape>();
    }


    public void add( Shape shape ) {
        shapes.add( shape );
    }

    private static Double accumulateArea( Double subtotal, Shape shape ) {
        return subtotal + shape.calcArea();
    }

    @Override
    public double calcArea() {
        Double total = shapes.stream().reduce( 0D, ShapeComposite::accumulateArea, Double::sum );

        /** Version vista en clase
         * -----------------------
         double total = 0;
         for ( var shape : shapes ) {
         total += shape.calcArea();
         }
         * -----------------------
         **/

        return total;
    }
}
