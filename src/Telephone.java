public class Telephone {

    String brand;
    int resolution;
    String number;

    public Telephone(String brand, int resolution, String number) {
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
    }

    public void sendSMS(String message){
        System.out.println("I am sending a message" + message + " to number " + number);
    }
}