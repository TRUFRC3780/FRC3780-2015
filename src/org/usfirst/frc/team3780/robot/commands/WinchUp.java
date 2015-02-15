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
import org.usfirst.frc.team3780.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Raises the winch.
 */
public class WinchUp extends Command {

    public WinchUp() {
		requires(Robot.winch);
    }

    protected void initialize() {
    }

    /**
     * Raise winch at speed.
     */
    protected void execute() {
    	Robot.winch.drive(RobotMap.winch_up_speed);
    }

    protected boolean isFinished() {
        return false;
    }

    /**
     * Set winch speed to zero.
     */
    protected void end() {
    	Robot.winch.drive(0);
    }

    /**
     * Stop the winch if command is interrupted.
     */
    protected void interrupted() {
    	end();
    }
    
}
