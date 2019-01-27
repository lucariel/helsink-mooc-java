/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch;
import java.util.*;
/**
 *
 * @author lucariel
 */
public class Person {
    private String name;
    private ArrayList<String> numbers;
    private ArrayList<String> address;

    public Person(String name) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.address= new ArrayList<String>();
    }
   
    
    public boolean searchByNumber(String n){
        if(numbers.contains(n)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getName() {
        return name;
    }
    public void addNumber(String n){
        numbers.add(n);
    }

    public String getNumbers() {
        String numbers = "   ";
        for(String a : this.numbers){
            numbers+=a+"\n   ";
        }
        
        return numbers;
    }

    public String getAddress() {
        String b = "";
        
        for(String a : address){
            b+=a;
            b+=" ";
        }
        return b;
    }
    
    public void giveAddress(String street, String city){
        this.address.add(street);
        this.address.add(city);
    }
    public void printInformation(){
        String address;
        if(this.address.size()>0){
            address = this.getAddress();
        }
        else{
            address = "unknown";
        }
        System.out.println("  address "+address);
        if(this.numbers.size()>1){
            System.out.println("  phone numbers: \n"+this.getNumbers());
        }
        if(this.numbers.size()==1){
            System.out.println("  phone number: "+this.getNumbers());
        }
        if(this.numbers.size()<1){
            System.out.println("  phone number not found");
        }
        
    }

    
    
}
