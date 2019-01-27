import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int suma=0;
        for(int num : list){
            suma = suma+num;
        }
        return suma;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avr;
        avr = (double)sum(list)/(double)list.size();
        
        return avr;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double numerator=0;
        double denominator= list.size()-1;
        double avr = average(list);
       
        for(int num : list){
            numerator = numerator + Math.pow(num-avr,2);
        }
        System.out.println(numerator);
        return numerator/denominator;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        //list.add(2);
        //list.add(7);
        list.add(3);
        
        System.out.println("The variance is: " + variance(list));
    }

}
