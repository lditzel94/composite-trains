package org.patterns;

import org.patterns.composite.*;

public class Main {
    public static void main( String[] args ) {
        Shape triangle = new Triangle( 2, 2 );
        Shape rectangle = new Rectangle( 2, 2 );
        Shape circle = new Circle( 4 );

        ShapeComposite shapeComposite = new ShapeComposite();
        shapeComposite.add( triangle );
        shapeComposite.add( rectangle );
        shapeComposite.add( circle );

        System.out.println("Total area: " + shapeComposite.calcArea());
    }
}