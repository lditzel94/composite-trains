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

    @Override
    public double calcArea() {
        Double total = shapes.stream().reduce( 0D, ( subtotal, shape ) -> subtotal + shape.calcArea(), Double::sum );

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
