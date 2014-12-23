/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.commands;

/**
 *
 * @author Joy
 */
public class DriveWithJoysticks extends CommandBase {
    
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(DriveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        DriveSystem.drive();
        DriveSystem.turn();
        
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
