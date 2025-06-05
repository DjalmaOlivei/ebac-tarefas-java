package factory;

public class CarFactory extends Factory {

    @Override
    public Car create(String car) {
        switch (car){
            case "lifang":{
                return new Lifang("blue","ethanol",2);

            }
            case "jac":{
                return new Jac("red","gasoline",4);

            }
            default: System.out.println("Not avalible");

        }
        return null;
    }
}
