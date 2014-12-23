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
import us.oh.k12.wkw.cart.circuitPi.commands.ArmDoNothing;

/**
 *
 * @author Joy
 */
public class HeightArm extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController armHeightMotor = new Jaguar(RobotMap.armHeightMotor);
    
    public static final double cake = .7;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmDoNothing());
    }
    public void armDoNothing() {
        armHeightMotor.set(0.0);
    }
    
    public void goUp() {
        armHeightMotor.set(cake);
    }
    
    public void goDown() {
        armHeightMotor.set(-cake);
    }
}
