
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        
        RegistrationPlate compared = (RegistrationPlate) object;
        if(this.getCountry() != compared.getCountry()){
            return false;
        }
        if(this.getRegCode() != compared.getRegCode()){
            return false;
        }
                
        return true;
    }
    public int hashCode(){
       return (this.country+this.regCode).hashCode();
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }

}
