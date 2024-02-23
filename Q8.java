class MethodOverloading{
    int  computatio(int length ,int  height){
        return (length*height);
    }
    void computatio(String name ,int age){
        System.out.println("Name : "+name +" , Age"+ age);
    }

    double computatio(double mass, double acceleration ){
        return (mass * acceleration);
    }
}


public class Q8 {
    public static void main(String args[]){
        MethodOverloading overloading = new MethodOverloading();
        System.out.println("The area of rectanglle is : "+overloading.computatio(5,3));
        overloading.computatio("mohsin" , 12);
        System.out.println( "The force is : "+overloading.computatio(10.4,9.4));
    }
}
