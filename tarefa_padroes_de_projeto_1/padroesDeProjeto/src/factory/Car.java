package factory;

public abstract class Car {

    private String color;
    private String fuelType;
    private int sits;
    private boolean isClean = false;

    public Car(String color, String fuelType,int sitsNumber){
        this.color  = color;
        this.fuelType = fuelType;
        this.sits = sits;
    }

    public  void clean(){
        this.isClean = true;
        System.out.println( this.toString() +"'s now clean");
    }

    public int getSits(){
        return this.sits;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", sits=" + sits +
                ", isClean=" + isClean +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
