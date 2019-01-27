/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Bird {

    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + name + ", latinName=" + latinName + '}';
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

}
