class Datetest{
    int month;
    int day;
    int year;

    Datetest(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;

    }
    void printdata(){
        System.out.println("dATE = "+ day +" "+month + " "+year);
    }
}

public class q3test {
    public static void main(String args[]){
        Datetest D1 = new Datetest(12,05,2005);
        D1.printdata();
    }
}
