//Method overloading

class MethodOverloading{
    void show(int n){
        System.out.println(n);
    }
    void show(int n , int m){
        System.out.println(n+" "+m);;
    }
}


public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.show(5);
        methodOverloading.show(1,7);
    }

}
