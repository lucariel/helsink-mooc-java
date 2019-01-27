
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){
        boolean dplc = false;
        for(int i = 0; i<this.meals.size();i++){
            if(meal == this.meals.get(i)){
                dplc = true;
            }
        }
        if(!dplc){
        this.meals.add(meal);}
    }
    
    public void printMeals(){
        
        for(int i = 0; i<this.meals.size(); i++){
            System.out.println(this.meals.get(i));
        }
        
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
