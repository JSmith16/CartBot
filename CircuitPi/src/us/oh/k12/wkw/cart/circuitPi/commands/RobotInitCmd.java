/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package us.oh.k12.wkw.cart.circuitPi.commands;

/**
 *
 * @author Gateway
 */
public class RobotInitCmd extends CommandBase {
    
    public RobotInitCmd() {
        super("RobotInitCmd");
    }
    
    public void initRobot() {
       super.initRobot();
    }
    
    protected void initialize() {
              
    }

    protected void execute() {
        //nothing
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
       
    }

    protected void interrupted() {
        
    }
    
}
