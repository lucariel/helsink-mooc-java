
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int priceA= this.pricePerSquareMeter*this.squareMeters;
        int priceB=otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
        if(priceA>priceB){
            return priceA-priceB;
        }
        else{
            return priceB-priceA;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        int priceA= this.pricePerSquareMeter*this.squareMeters;
        int priceB=otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
        if(priceA>priceB){
            return true;
        }
        else{
            return false;
        }
    }
    
}
