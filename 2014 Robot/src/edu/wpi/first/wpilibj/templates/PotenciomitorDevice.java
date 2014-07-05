/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

/**
 *
 * @author Chance
 */
public class PotenciomitorDevice implements IStep {

    int port;
    AnalogPotentiometer pontentiometer;
    public void step() {
        
    }

    public PotenciomitorDevice init() {
        pontentiometer = new AnalogPotentiometer(port);
        return this;
    }

    public PotenciomitorDevice setPort(int port) {
        this.port = port;
        return this;
    }
    public double get(){
        return pontentiometer.get();
    }
    
    public void test() {
        System.out.println("No test for this device");
    }
}
