
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    public boolean equals(Object bird){
        if(bird == null){
            return false;
        }
        if(this.getClass()!=bird.getClass()){
            return false;
        }
        
        Bird compared = (Bird) bird;
        
        
        if(this.ringingYear!=compared.ringingYear){
            return false;
        }
        
        if(this.latinName == null || !this.latinName.equals(compared.latinName)){
            return false;
        }
        
        return true;
    }
    
    public int hashCode(){
        return this.ringingYear*this.latinName.hashCode();
    }
    

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }
}


