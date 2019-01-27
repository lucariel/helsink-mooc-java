/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.*;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        Purchase a = new Purchase(product, 1, price);
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        
        }
        else{
            basket.put(product, a);
        
        }

    }

    public int price() {
        int p = 0;
        for (Purchase a : basket.values()) {
            p = p + a.price();
        }
        return p;
    }

    public void print() {
        for (Purchase a : basket.values()) {
            System.out.println(a.toString());
        }
    }
}
