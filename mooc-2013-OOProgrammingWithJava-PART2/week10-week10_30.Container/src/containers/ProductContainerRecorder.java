/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author lucariel
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerH;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerH = new ContainerHistory();
        containerH.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history() {
        return this.containerH.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount); 
        this.containerH.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double temp = super.takeFromTheContainer(amount); 
        this.containerH.add(super.getVolume());
        return temp;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history());
        System.out.println("Greatest product amount: "+ this.containerH.maxValue());
        System.out.println("Smallest product amount: "+ this.containerH.minValue());
        System.out.println("Average: "+this.containerH.average());
        System.out.println("Greatest change: "+this.containerH.greatestFluctuation());
        System.out.println("Variance: "+this.containerH.variance());
    }
    

}
