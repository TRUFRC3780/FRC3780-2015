/*
* Copyright 2015 FRC3780 (Brian Fogarty, Andy Lee) Licensed under the
* Educational Community License, Version 2.0 (the "License"); you may
* not use this file except in compliance with the License. You may
* obtain a copy of the License at
* 
* http://www.opensource.org/licenses/ECL-2.0
* 
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an "AS IS"
* BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing
* permissions and limitations under the License.
*/

package org.usfirst.frc.team3780.robot.subsystems;

import org.usfirst.frc.team3780.robot.RobotMap;
import org.usfirst.frc.team3780.robot.commands.ChassisDrive;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Controls the four CIM tank drive.
 */
public class Chassis extends Subsystem {
    
	RobotDrive drive;
	Talon frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive;
	
	public Chassis() {
		frontLeftDrive = new Talon(RobotMap.chassis_front_left_drive_channel);
		rearLeftDrive = new Talon(RobotMap.chassis_rear_left_drive_channel);
		frontRightDrive = new Talon(RobotMap.chassis_front_right_drive_channel);
		rearRightDrive = new Talon(RobotMap.chassis_rear_right_drive_channel);
		drive = new RobotDrive(frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}
	
	/**
	 * Controls the drivetrain with two joysticks.
	 * @param jLeft left joystick
	 * @param jRight right joystick
	 */
	public void tankDrive(Joystick jLeft, Joystick jRight) {
		drive.tankDrive(jLeft, jRight);
	}
	
	// @param speedL the left drive speed
	// @param speedR the right drive speed
	public void setDrive(double speedL,double speedR) {
		drive.setLeftRightMotorOutputs(-speedL,-speedR);
	}
	
	public void driveForward(double speed) {
		setDrive(speed,speed);
	}
	
	public void stopDrive() {
		setDrive(0,0);
	}
	
	public void arcadeDrive(Joystick j) {
		drive.arcadeDrive(j,true);
	}
	
	public void arcadeDrive(double X, double y) {
		drive.arcadeDrive(X, y);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new ChassisDrive());
    }
}

