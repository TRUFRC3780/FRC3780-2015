package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

/**
 * Fall apart to halftime
 * @author Andy Lee, Fall Out Boy
 */
public class DanceDance extends Command {
	
	private int iterations;
	private Timer timer;
	
	private double leftSpeed,rightSpeed;
	
	private double interval;
	
    public DanceDance(int iterations,double speed,double interval) {
    	requires(Robot.chassis);
    	this.iterations = iterations;
    	leftSpeed = speed;
    	rightSpeed = -speed;
    	this.interval = interval;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	timer = new Timer();
    	timer.stop();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(timer.get() >= interval) {
    		leftSpeed = rightSpeed;
    		rightSpeed = -leftSpeed;
    		iterations--;
    		timer.reset();
    	}
    	Robot.chassis.setDrive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return iterations <= 0; 
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.stopDrive();
    	timer.reset();
    	timer.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
