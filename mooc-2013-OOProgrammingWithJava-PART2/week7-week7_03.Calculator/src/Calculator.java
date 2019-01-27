/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Calculator {
    private Reader reader = new Reader();
    private int a = 0;
    public void start() {
        while (true) {
            
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
                a++;
            } else if (command.equals("difference")) {
                difference();
                a++;
            } else if (command.equals("product")) {
                product();
                a++;
            }
            
        }

        statistics();
        
    }
    private void statistics(){
        System.out.println("Calculations done "+a);
    }
        
    private void sum(){
            System.out.println("value1: ");
            int value1 = reader.readInteger();
            System.out.println("value2: ");
            int value2 = reader.readInteger();
            int suma = value1+value2;
            System.out.println("sum of the values "+suma);
        
    }
        
    private void difference(){
            System.out.println("value1: ");
            int value1 = reader.readInteger();
            System.out.println("value2: ");
            int value2 = reader.readInteger();
            int suma = value1-value2;
            System.out.println("difference of the values "+suma);
        
    }
        
    private void product(){
            System.out.println("value1: ");
            int value1 = reader.readInteger();
            System.out.println("value2: ");
            int value2 = reader.readInteger();
            int suma = value2*value1;
            System.out.println("product of the values "+suma);
        
    }
    
}
