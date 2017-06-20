package ca.wcantin.decorator_pattern;

/**
 * Created by William on 2017-06-19.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
