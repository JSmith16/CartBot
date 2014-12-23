/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveWithJoysticks;

/**
 *
 * @author Joy
 */
public class DriveSystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController leftMotor = new Jaguar(RobotMap.leftMotor);
    SpeedController rightMotor = new Jaguar(RobotMap.rightMotor);
    
    public static double leftSpeed;
    public static double rightSpeed;
    
    //Joystick Drive = new OI.Drive;
 

 
    public void initDefaultCommand(){
        // Set the default command for a subsystem here.
        
        setDefaultCommand(new DriveWithJoysticks());

    }


    public void driveWithJoysticks() {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }
    
    /*public void turn() {
        leftMotor.set(turn);
        rightMotor.set(turn);
    }
    */
    
    public void doNothing() {
        leftMotor.set(0.0);
        rightMotor.set(0.0);
    }

   
}
