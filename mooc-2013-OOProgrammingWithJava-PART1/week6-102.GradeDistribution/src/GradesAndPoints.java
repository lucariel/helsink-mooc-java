/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author lucariel
 */
class GradesAndPoints {
    private String cero = "";
    private String uno = "";
    private String dos = "";
    private String tres = "";
    private String cuatro = "";
    private String cinco = "";

    public String getCero() {
        return cero;
    }

    public String getUno() {
        return uno;
    }

    public String getDos() {
        return dos;
    }

    public String getTres() {
        return tres;
    }

    public String getCuatro() {
        return cuatro;
    }

    public String getCinco() {
        return cinco;
    }
    private int grade;
    public int grader(int number) {
        
        if (number < 30) {
            grade = 0;
        } else if (number < 35) {
            grade = 1;
        } else if (number < 40) {
            grade = 2;
        } else if (number < 45) {
            grade = 3;
        } else if (number < 50) {
            grade = 4;
        } else if (number <= 60) {
            grade = 5;
        }
        return grade;
    }
    public boolean accepted(int g){
        if(g == 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public double acceptanceRate(ArrayList<Integer> list){
        int count = 0;
        
        for(int a : list){
           if(this.accepted(a)){
               count++;
           }
        }
        
        return (double)count/(double)list.size()*100;
    }
    
    
    public GradesAndPoints() {
    }
    public void stars(ArrayList<Integer> list){
        for(int a : list){
            if(a==0){
                this.cero=this.cero+"*";
            }
            else if(a==1){
                this.uno=this.uno+"*";
            }
            
            else if(a==2){
                this.dos=this.dos+"*";
            }
            
            else if(a==3){
                this.tres=this.tres+"*";
            }
            
            else if(a==4){
                this.cuatro=this.cuatro+"*";
            }
            
            else if(a==5){
                this.cinco=this.cinco+"*";
            }
        }
    }
    
}
