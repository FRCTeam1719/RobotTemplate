/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.testmode;

import edu.wpi.first.wpilibj.templates.Devices;
import edu.wpi.first.wpilibj.templates.SmartDashboardReader;

/**
 *
 * @author aaroneline
 */
public class TestMode {
    
    public void test(){
        for(int i  =0; i<Devices.devices.length; i++){
            Devices.devices[i].test();
        }
        
    }
    
    
    
    
}
