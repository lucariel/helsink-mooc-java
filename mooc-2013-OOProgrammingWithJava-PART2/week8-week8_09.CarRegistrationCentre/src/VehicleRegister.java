
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucariel
 */
public class VehicleRegister {

    HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String name) {
        if (owners.containsKey(plate)) {
            System.out.println("wont repeat");
            return false;
        } else {
            System.out.println("added");
            owners.put(plate, name);
            return true;
        }
    }
    public void listCars(){
        for(RegistrationPlate pl : owners.keySet()){
            System.out.println(pl);
        }
    }
    

}
