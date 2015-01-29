/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmDoNothing;
import us.oh.k12.wkw.device.cart.circuitPi.WkwCompressor;


public class HeightArm extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Compressor compressor;
    
    private DoubleSolenoid armDoubleSolenoid;
    
    public HeightArm() {
        
        this.initCompressor();
        
        this.initArm();
        
    }
    
    private void initCompressor() {
        this.compressor = new WkwCompressor(
                RobotMap.ARM_COMPRESSOR_PRESSURE_SWITCH_DIGITAL_INPUT_PORT,
                RobotMap.ARM_COMPRESSOR_SPIKE_RELAY_OUTPUT_PORT); 
        this.compressor.start();
               
    }
    
    public void startCompressor() {
     
        this.compressor.start();
        
    }   
    
    public void stopCompressor() {
        
        this.compressor.stop();
    
    }
    
    private void initArm() {
        
        this.armDoubleSolenoid = new DoubleSolenoid(
                    RobotMap.ARM_DOUBLESOLENOID_UP_OUTPUT_PORT,
                    RobotMap.ARM_DOUBLESOLENOID_DOWN_OUTPUT_PORT);
        this.armDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
        
    }
    
   
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmDoNothing());
    }
    
    
    //
    //
    //methods called from commands
    //
    //
    public void armDoNothing() {
        
        this.armDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
        
    }
    
    public void goUp() {
        
        this.armDoubleSolenoid.set(DoubleSolenoid.Value.kForward);

    }
    
    public void goDown() {

        this.armDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
        
    }
    

    
}
