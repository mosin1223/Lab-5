class employinfo{
    int salary;
    int WPH;
    int finalsalary;

    void collectInfo(int salary ,int worktime){
        this.salary=salary;
        this.WPH=worktime;
    }
    void AddWork(){
        if(WPH>6){
            salary+=5;
        }
        else{
            System.out.println("you are not applicable for bonus ");
        }
    }
    void printfinal(){
        System.out.println("the final salery is : $"+salary);
    }

}

public class q4test {
    public static void main(String args[]){
        employinfo e1=new employinfo();
        e1.collectInfo(1000,8);
        System.out.println("Before adding " );e1.printfinal();
        e1.AddWork();
        System.out.println("after adding hour ");e1.printfinal();


    }
}
