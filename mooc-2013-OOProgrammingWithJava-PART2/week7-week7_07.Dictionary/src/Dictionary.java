
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucariel
 */
public class Dictionary {

    private HashMap<String, String> words;

    public Dictionary() {
        words = new HashMap<String, String>();
    }

    public String translate(String word) {
        String w = word.toLowerCase().trim();
        if (words.containsKey(w)) {
            return words.get(w);
        } else {
            return null;
        }
    }

    public void add(String word, String translation) {
        words.put(word, translation);

    }

    public int amountOfWords() {
        int a = 0;
        for (String key : this.words.keySet()) {
            a++;
        }

        return a;

    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList();
        for(String key : this.words.keySet()){
            list.add(key+" = "+words.get(key));
        }
        
        return list;
    }

}
