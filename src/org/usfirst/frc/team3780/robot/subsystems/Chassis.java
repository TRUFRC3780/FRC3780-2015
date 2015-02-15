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
import org.usfirst.frc.team3780.robot.commands.DriveRobot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This subsystem controls the four CIM tank drive.
 */
public class Chassis extends Subsystem {
    
	RobotDrive drive;
	Talon frontLeft, rearLeft, frontRight, rearRight;
	
	public Chassis() {
		frontLeft = new Talon(RobotMap.chassis_front_left_drive_channel);
		rearLeft = new Talon(RobotMap.chassis_rear_left_drive_channel);
		frontRight = new Talon(RobotMap.chassis_front_right_drive_channel);
		rearRight = new Talon(RobotMap.chassis_rear_right_drive_channel);
		drive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
	}
	
	/**
	 * Controls the drivetrain with two joysticks.
	 * @param jLeft left joystick
	 * @param jRight right joystick
	 */
	public void tankDrive(Joystick jLeft, Joystick jRight) {
		drive.tankDrive(jLeft, jRight);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveRobot());
    }
}

