package middle.man.learning.entity;

public class Developer extends Employee {
    public Developer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 500;
    }
}
