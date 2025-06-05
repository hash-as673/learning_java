class Student{
    private String name;
    private String stream;
    void setName(String name){
        this.name = name;
    }
    void setStream(String stream){
        this.stream = stream;
    }
    void getName(){
        System.out.println(name);
    }
    void getStream(){
        System.out.println(stream);
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hale");
        student.setStream("CSE");
        student.getName();
        student.getStream();
    }
}
