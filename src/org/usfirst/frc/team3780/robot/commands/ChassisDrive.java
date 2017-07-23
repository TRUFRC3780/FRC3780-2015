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

package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Drives the robot using two joysticks.
 */
public class ChassisDrive extends Command {

	/**
	 * Requires the chassis subsystem.
	 */
    public ChassisDrive() {
    	requires(Robot.chassis);
    }

    protected void initialize() {
    }

    /**
     * Passes driveJoysticks from the OI to the tankDrive method in the subsystem.
     */
    protected void execute() {
    	// Robot.chassis.tankDrive(Robot.oi.getDriveJoysticks().get(0), Robot.oi.getDriveJoysticks().get(1));
    	Robot.chassis.arcadeDrive(Robot.oi.getDriveJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
