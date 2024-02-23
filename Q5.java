import java.util.*;
class findlastdigit{
    static int num;
    void set(int num){this.num=num;}
    static int last(){
        return num % 10;
    }
}
public class Q5 {
    public static void main(String args[]){
    Scanner write = new Scanner (System.in);
    findlastdigit f1 = new findlastdigit();
    int num;
        System.out.print("Enter number : ");
        num = write.nextInt();
        f1.set(num);
        System.out.println("the last digit is : "+ findlastdigit.last());


    }
}
