/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
import java.util.Comparator;
public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        if(card1.getSuit() - card2.getSuit() == 0){
            return card1.getValue() - card2.getValue();
        }else{
            return card1.getSuit() - card2.getSuit();
}
    }
    
    
}
