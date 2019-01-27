package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> characterSet;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        this.characterSet = new HashSet<String>();
        this.duplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(this.characterSet.contains(characterString)){
            this.duplicates++;
        }
        this.characterSet.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.characterSet;
    }

    @Override
    public void empty() {
        this.duplicates = 0;
        this.characterSet.clear();
    }
    
}