/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Flight {
    Airplane airplanes;
    String DepAirportCode;
    String DesAirportCode;

    public Flight(Airplane airplanes, String DepAirportCode, String DesAirportCode) {
        this.airplanes = airplanes;
        this.DepAirportCode = DepAirportCode;
        this.DesAirportCode = DesAirportCode;
    }

    @Override
    public String toString() {
        return airplanes.toString() + " (" + this.DepAirportCode + "-" + this.DesAirportCode+")";
    }

    public Airplane getAirplanes() {
        return airplanes;
    }

    public String getDepAirportCode() {
        return DepAirportCode;
    }

    public String getDesAirportCode() {
        return DesAirportCode;
    }
    
    
    
    
}
