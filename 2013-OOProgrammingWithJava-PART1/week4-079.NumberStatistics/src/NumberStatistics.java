

 
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    //private double avr;
    
     public NumberStatistics() {
         this.amountOfNumbers = 0;
         this.sum = 0;
         
         
        // initialize here the object variable amountOfNumbers
        
    }
    
    public void addNumber(int number){
        this.amountOfNumbers++;
        this.sum = this.sum+number;
    }
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if(this.amountOfNumbers == 0){
            return 0;
        }
        else{
            return (double)this.sum/(double)this.amountOfNumbers;
        }
        
    }
}
