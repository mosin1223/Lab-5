import java.util.Scanner;
class Q2 {
    static int  num=0;
    void setdata(int num){this.num=num;}
      static int l=0;
     static int medium=0;
     static int small=1;
    static int smallp=1;
      static double largePrice=0;
    static double mediumPrice=0;
    static double smallPrice=0;
    static double totalPrice=0;
    static int finalprice=0;
    static double  large1() {

       l = num/20;
       num=num%20;
       medium = num/10;
       num=num%10;
       smallp = num;
       largePrice = (double)(l*20*5.50);
        mediumPrice = (double)(medium*10*5.50);
        smallPrice = (double)(small*smallp*5.50);
       return totalPrice=largePrice+mediumPrice+smallPrice;
    }
}



public class q2test{
    public static void main(String args[]){
        Q2 box = new Q2();
        Scanner write = new Scanner(System.in);
        int num;
        System.out.print("enter the number of boxes yu want : ");
        num=write.nextInt();
        box.setdata(num);


        System.out.println(Q2.large1());
        System.out.println("Large = "+Q2.l+ " = "+(double)(Q2.l*1.80) +
                "\n Medium = "+Q2.medium +" = " +(double)(Q2.medium*1.00) +
                "\n Small= "+Q2.small +" = "+(double)(Q2.small*0.60));

        System.out.println("The total price is : "+ (double)(Q2.totalPrice+(Q2.medium*1.00)+(Q2.l*1.80)+(Q2.small*0.60)));
    }
}
