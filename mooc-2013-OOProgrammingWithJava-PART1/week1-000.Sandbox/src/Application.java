// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.*;
public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        
        List<Double> list = new ArrayList<Double>();
        double cta = 345.64293;
        double sd=0;
        for(int i = 0; i<30;i++){
            list.add(cta*Math.pow(1.017,i));
            sd = sd+cta*Math.pow(1.017,i);
        }
        

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(sd);
    }
}
