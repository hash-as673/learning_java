class Animal{
    String name;
    int age;
    Animal(String name, int age){
        name = this.name;
        age = this.age;
    }
    void sound(){
        System.out.println("Animal making sound");
    }
}

class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Bow bow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Max",4);
        dog.sound();
    }
}
