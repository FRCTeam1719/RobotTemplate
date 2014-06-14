/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.autonomous.*;
import edu.wpi.first.wpilibj.templates.testmode.TestMode;
import edu.wpi.first.wpilibj.Gyro;

/**
 *
 * @author Chance
 */

public class TestDevices {
    public static IStep[] devices;
    public static SmartDashboardReader smartDashboardReader;
    static Log logger = new Log();
    public static LogLevelCheck logChecker = new LogLevelCheck();
       
    public void step() {
        for (int i = 0; i < TestDevices.devices.length; i++) {
            TestDevices.devices[i].step();
        }

    }

    public void init() {
        
        
        smartDashboardReader = new SmartDashboardReader();
        smartDashboardReader.init();
        
        //Devices array
        devices = new IStep[]{
            smartDashboardReader,
            logger,
        };
        //Don't put anything after here
    }
    
}
