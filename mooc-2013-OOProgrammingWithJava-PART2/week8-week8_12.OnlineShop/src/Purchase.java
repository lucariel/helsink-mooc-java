/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Purchase {
   private String product;
   private int amount;
   private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }
    
    
    public int price() {
        return amount*unitPrice;
    }
    
    public void increaseAmount(){
        this.amount++;
    }

    @Override
    public String toString() {
        return this.product+": "+this.amount;
    }
    
    /*public boolean equals(Object object){
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }
        Purchase compared = (Purchase) object;
        if(!this.product.equals(compared.product)){
            return false;
        }
        return true;
    }*/

    public String getProduct() {
        return product;
    }

   
}
