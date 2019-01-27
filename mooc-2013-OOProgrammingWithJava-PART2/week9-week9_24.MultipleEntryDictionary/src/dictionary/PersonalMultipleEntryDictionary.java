/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lucariel
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> med;

    public PersonalMultipleEntryDictionary() {
        this.med =  new HashMap<String, Set<String>>();;
    }


    public void add(String word, String entry) {
        if(!this.med.containsKey(word)){
            this.med.put(word, new HashSet<String>());
        }
        this.med.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(med.containsKey(word)){
            return this.med.get(word);
        }
        else{
            return null;
        }
        
    
    }

    @Override
    public void remove(String word) {
        if(med.containsKey(word)){
            this.med.remove(word);
        }
    }
    
}
