package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward extends Command {
	
	private double speed, time;
	private Timer timer;

    public DriveForward(double speed,double time) {
    	requires(Robot.chassis);
    	this.speed = speed;
    	this.time = time;
    	this.timer = new Timer();
    	timer.stop();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.driveForward(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= time;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.stopDrive();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
