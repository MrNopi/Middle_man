package middle.man.learning.solid.lisp;

public class RectangleWrong extends ShapeWrong {
    @Override
    public int calculatePerimeter() {
        return (a + b) + (c + d) * 2;
    }
}
