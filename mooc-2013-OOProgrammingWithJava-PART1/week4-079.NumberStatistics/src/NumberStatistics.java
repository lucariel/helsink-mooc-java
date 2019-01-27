
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum = this.sum+number;
       
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    public int sum() {
        // code here
        return this.sum;
    }
    
   

    public double average() {
        
            // code here
            if(this.amountOfNumbers!=0){
            return (double)this.sum/(double)this.amountOfNumbers;
            }
            else{
                return 0;
            }
    }
         
}
