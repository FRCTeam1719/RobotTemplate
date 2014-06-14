/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.tables.ITable;
import edu.wpi.first.wpilibj.templates.testmode.TestMode;

//TODO: what is the thingy printline
//HI CHANCE 
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    
    Devices devices = new Devices();
    AutonDevices autonDevices = new AutonDevices();
    TestDevices testDevices = new TestDevices();
    //Dont Touch this, it keeps the demons away: shouldlivewindow.txt
    public static boolean shouldLiveWindow = false;
    public void robotInit() {
        devices.init();
    }
    
    
    
    public void autonomousInit(){      
       SmartDashboard.putString("Mode", "auton");
       autonDevices.init();
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        autonDevices.step();
    }
    
    public void teleopInit(){
        SmartDashboard.putString("Mode", "teleop");
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        devices.step();
    }
    
    public void testInit() {
        testDevices.init();
        SmartDashboard.putString("Mode", "test");
    }
    /**
     * This Function is called periodically during Test Mode
     */
    public void testPeriodic() {
        testDevices.step();
        //Don't touch this, it keeps the demons away: shouldlivewindow.txt
        if(!SmartDashboardReader.getBoolean("shouldLiveWindow", false)){
        SmartDashboardReader.putBoolean("~STATUS~/LW Enabled", false, false);
        }
    }
}
