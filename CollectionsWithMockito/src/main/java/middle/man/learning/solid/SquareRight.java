package middle.man.learning.solid;

public class SquareRight implements ShapeRight {
    private int ab;

    @Override
    public int calculatePerimeter() {
        return ab * 4;
    }
}
