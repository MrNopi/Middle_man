package middle.man.learning.solid.lisp;

public class SquareRight implements ShapeRight {
    private int ab;

    @Override
    public int calculatePerimeter() {
        return ab * 4;
    }
}
