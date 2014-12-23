/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import us.oh.k12.wkw.cart.circuitPi.OI;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveDoNothing;
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
     
   public static final double pi = 0.7;  //This number is the motor speed. Only change it UP HERE
   public double speed = 0.0;
   public double turn = 0.0;
   
   
   /*public void robotWeight(){
        if(RobotMap.weightSensor()>=5)
        {
            pi += .2;
        }
        else
        {
            pi += .1*(RobotMap.weightSensor());
        }
    }
    */
    //Joystick or Button?

   
   
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
            

        setDefaultCommand(new DriveWithJoysticks());



    }
    
    
    
   
    

    public void drive() {
 
        leftMotor.set(speed);
        rightMotor.set(speed);
        
    }
    
    public void turn() {
        leftMotor.set(turn);
        rightMotor.set(turn);
    }
    
    
    //BOTH:
    public void doNothing() {
        leftMotor.set(0.0);
        rightMotor.set(0.0);
    }
         
   
}
