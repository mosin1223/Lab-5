class ArayUtils{
   static int i;
    static int maximum(int[] array){
         int max=array[0];
        for(i=0;i<array.length;i++){
           if(array[i]>max){
               max=array[i];
           }
           else continue;

        }return max;
    }
}
public class Q6 {
    public static void main(String args[]){
        int[] array = {10,20,30,40,50};
        System.out.println("The max num from array is : "+ ArayUtils.maximum(array));
    }
}
