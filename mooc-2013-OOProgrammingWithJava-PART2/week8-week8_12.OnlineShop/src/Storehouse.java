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

public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stored;

    public Storehouse() {
        products = new HashMap<String, Integer>();
        stored = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stored.put(product, stock);

    }

    public int price(String product) {
        if (stored.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stored.containsKey(product)) {
            return stored.get(product);
        }
        return 0;
    }

    public Set<String> products() {
        return stored.keySet();
    }

    public boolean take(String product) {
        if (stored.containsKey(product) && stored.get(product) > 0) {
            stored.replace(product, stored.get(product)-1);
            
            return true;
        }
        return false;
    }
}
