
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("The top 10 by goals: ");
        
        NHLStatistics.sortByGoals(); 
        NHLStatistics.top(10);
        
        
        System.out.println("The top 10 by Penalties");
        NHLStatistics.sortByPenalties(); 
        NHLStatistics.top(25);
        
        System.out.println("Sidneys Crosby's Statistics");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("The Philadelphia Flyers:");
        NHLStatistics.teamStatistics("PHI");
        
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
