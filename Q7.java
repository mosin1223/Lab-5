import java.util.Scanner;
class checking{
   private  int num;
    int temp=1;
    int i;
   static int chknum=0;
   void set(int num){this.num=num;}
    int factorial(){
       for( i =1;i<=num;i++){
           temp=temp*i;
           chknum=i;
           if(temp==num){

               break ;
           }
       }return temp;
    }
}
public class Q7 {
    public static void main(String args[]){
        checking c1 = new checking();
        Scanner write = new Scanner (System.in);
        int num ;
        System.out.print("enter any num : ");
        num=write.nextInt();
        c1.set(num);

        if(c1.factorial()==num){
            System.out.println("the factorial of " + num +" is : " +checking.chknum);
        }
        else {
            System.out.println(num +" has no any factorial");
        }






    }
}
