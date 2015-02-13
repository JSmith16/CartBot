package us.oh.k12.wkw.cart.circuitPi.commands;

import edu.wpi.first.wpilibj.command.Command;
import us.oh.k12.wkw.cart.circuitPi.OI;
import us.oh.k12.wkw.cart.circuitPi.subsystems.DriveSystem;
import us.oh.k12.wkw.cart.circuitPi.subsystems.HeightArm;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi = null;

    public static HeightArm heightArm = null;
    public static DriveSystem driveSystem = null;
    

    protected void initRobot() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
         CommandBase.oi = new OI();
         
         CommandBase.driveSystem = new DriveSystem();
         CommandBase.heightArm = new HeightArm();
         

    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
    protected OI getOI() {
        return CommandBase.oi;
    }
    
    public DriveSystem getDriveSystem() {
        return CommandBase.driveSystem;
    }
    
    public HeightArm getArmSystem() {
        return CommandBase.heightArm;
    }

    
}
