/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.logging.FileHandler;

/**
 *
 * @author lucariel
 */
public class MindfulDictionary {

    private Map<String, String> dict;
    //private String file;
    private String file;

    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.dict = new HashMap<String, String>();

        this.file = file;

    }
    
    public boolean save(){
        FileWriter writer;
        try{
            writer = new FileWriter(this.file);
            for(String key : this.dict.keySet()){
                writer.write(key+":"+this.dict.get(key)+"\n");
            }
            writer.close();
            for(String key : this.dict.keySet()){
                System.out.println(key+":"+this.dict.get(key)+"\n");
            }
            
            return true;
            
        }
        catch(Exception e){
            return false;
        }
        
    }

    public boolean load() {

        try {
            File f = new File(this.file);
            Scanner fileReader = new Scanner(f);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                this.dict.put(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (dict.containsKey(word) | dict.containsValue(word)) {

        } else {
            dict.put(word, translation);

        }

    }

    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else if (this.dict.containsValue(word)) {
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void remove(String word) {
        if (this.dict.containsKey(word)) {
            this.dict.remove(word);
        }
        if (this.dict.containsValue(word)) {
            List<String> keys = new ArrayList<String>();
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    keys.add(key);
                }
            }
            for (String k : keys) {
                this.dict.remove(k);
            }
        }
}

}
