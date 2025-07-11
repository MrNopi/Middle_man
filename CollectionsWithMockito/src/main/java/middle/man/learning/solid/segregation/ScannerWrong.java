package middle.man.learning.solid.segregation;

public class ScannerWrong implements WrongInterface {
    @Override
    public void print() {
        return;
    }

    @Override
    public void scan() {
        System.out.println("scanning...");
    }

    @Override
    public void fax() {
        return;
    }
}
