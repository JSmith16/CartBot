/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import us.oh.k12.wkw.cart.circuitPi.OI;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveWithJoysticks;

public class DriveSystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController leftMotor = new Jaguar(RobotMap.leftMotor);
    SpeedController rightMotor = new Jaguar(RobotMap.rightMotor);
    
    public static double leftSpeed;
    public static double rightSpeed;
    
    
    //change maximum motor power
    private static final double joystickSensitivity = 1;
    
    //change the minimum speed on the joystick for the motor to move
    private static final double minSpeed = .005;
    //Joystick Drive = new OI.Drive;
 

 
    public void initDefaultCommand(){
        // Set the default command for a subsystem here.
        
        setDefaultCommand(new DriveWithJoysticks());

    }


    public void driveWithJoysticks(Joystick pJoystick) {
        
        double speed;
        speed = pJoystick.getY();
        
        double turn;
        turn = pJoystick.getX();
        
        double left;
        left = speed + turn;
        
        double right;
        right = speed - turn;
        
        left = fixSpeed(left);
        right = fixSpeed(right);
        
       
       
      /**
        DriveSystem.leftSpeed = speed + turn;
        DriveSystem.rightSpeed = speed - turn;
       */
        
        leftMotor.set(left);
        rightMotor.set(right);
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
    
    
    //Keeping the speed within the motor range.
    private double fixSpeed(double pValue) {
        if(pValue > 1){
            pValue = 1;
        } else if(pValue < -1) {
            pValue = -1;
        } else {
            //nothing
        }
        /**if(pValue > 0) {
            pValue = pValue * pValue;
        }
        if(pValue <= 0){
            pValue = -(pValue * pValue);
        }
        */
        
        if(pValue < minSpeed){
            pValue = 0.0;
        }
        
        pValue = pValue * joystickSensitivity;
        return pValue;
    }

   
}
