public class Car {

    String color;
    String make;
    int engineCapacity;

    public Car(String color, String make, int engineCapacity) {
        this.color = color;
        this.make = make;
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEngineTypeInfo(){
        return engineCapacity >= 21 ?
                "Engine is high-revving" :
                "Engine isn't high-revving";
    }
}