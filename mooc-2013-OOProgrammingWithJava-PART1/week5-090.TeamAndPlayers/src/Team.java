/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author lucariel
 */
public class Team {

    private String name;
    private int maxSize;
    private ArrayList<Player> list = new ArrayList<Player>();
    

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return name;
    }
    

    public void addPlayer(Player player) {
        if (list.size() < maxSize) {
            list.add(player);
        }
    }

    public void printPlayers() {
        for (Player a : list) {
            System.out.println(a.toString());
        }
    }
    
    public int size(){
        return list.size();
    }
    public int goals(){
        int goals = 0;
        for(Player a : list){
            goals = goals + a.goals();
        }
        return goals;
    }

}
