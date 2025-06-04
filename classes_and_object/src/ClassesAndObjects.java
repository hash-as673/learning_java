class Car {
    String color;
    String model;
    String year;
    Car(String color, String model, String year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}


public class ClassesAndObjects {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Toyota", "2020");
        myCar.displayDetails();
    }
}
