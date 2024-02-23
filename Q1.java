public class Q1 {
    public static void main(String args[]){
        car A = new car();
        A.brandname = "HONDA";
        A.color ="BLACK";
        A.odometer=100;
        A.pricenew=5800000;
        A.getpriceafteruse();
        A.outputDetail();
        A.updatemileage(21000);
        A.getpriceafteruse();
        A.outputDetail();
    }
}
class car{
    String brandname;
    double pricenew;
    String color;
    double odometer;

    double getpriceafteruse(){
        double cpabu = pricenew*(1-odometer/600000);
        return cpabu;
    }
    void updatemileage(double traveldistance){
        this.odometer=traveldistance;
    }
    void outputDetail(){
        System.out.println("Brand name : "+ brandname
                +"\nnew price is  : "+ pricenew
                +"\nprice aftr used : " + getpriceafteruse()
                +"\ncolor : "+color
                +"\nodometer : "+odometer);
    }
}
