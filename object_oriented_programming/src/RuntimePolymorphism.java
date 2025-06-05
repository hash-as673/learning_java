class Person{
    void role(){
        System.out.println("I am a person");
    }
}

class Father extends Person{
    @Override
    void role() {
        System.out.println("I am a father");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Father father = new Father();
        father.role();
    }
}
