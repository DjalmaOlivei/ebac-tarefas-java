//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import factory.*;

public class Main {
    public static void main(String[] args) {

    Factory fac = new CarFactory();
    Car car1 = fac.create("lifang");
    System.out.println(car1.toString());
    car1.clean();
    System.out.println(car1.toString());
    Car car2 = fac.create("jac");
    System.out.println(car2.toString());
    Car car3 = fac.create("abc");
    }
}