package org.usfirst.frc.team3780.robot.commands;
import org.usfirst.frc.team3780.robot.*;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Execute Autonomous commands
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
    	addSequential(new DriveForward(RobotMap.autonomous_drive_forward_speed,RobotMap.autonomous_drive_forward_time));
    	
    	addSequential(new DanceDance(
    			RobotMap.autonomous_dance_iterations,
    			RobotMap.autonomous_dance_speed,
    			RobotMap.autonomous_dance_interval
    			));
    	
                // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
