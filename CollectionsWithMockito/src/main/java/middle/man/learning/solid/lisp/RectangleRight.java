package middle.man.learning.solid.lisp;

public class RectangleRight implements ShapeRight {

    private int ab;
    private int cd;

    @Override
    public int calculatePerimeter() {
        return (ab + cd) * 2;
    }
}
