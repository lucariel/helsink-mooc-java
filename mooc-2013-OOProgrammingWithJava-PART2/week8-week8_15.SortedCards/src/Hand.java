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

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card c : hand) {
            System.out.println(c.toString());
        }
    }

    public int totalValue(){
        int r = 0;
        for(Card c : hand){
            r = r + c.getValue();
        }
        return r;
        
    }

    @Override
    public int compareTo(Hand t) {
        return this.totalValue()-t.totalValue();
    }
    public void sort() {
        Collections.sort(hand);
    }
    
    public void sortAgainstSuit(){
          Collections.sort(hand, new SortAgainstSuitAndValue() );
    }
    
    
}
