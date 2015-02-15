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
 * Opens the arms.
 */
public class ArmsOperate extends Command {

    public ArmsOperate() {
    	requires(Robot.arms);
    }

    /**
     * Shift gearboxes to low.
     */
    protected void initialize() {
    	new ArmsEngage();
    }

    /**
     * Drive arms at speed.
     */
    protected void execute() {
    	Robot.arms.drive(RobotMap.arms_left_arm_speed, RobotMap.arms_right_arm_speed);
    }

    protected boolean isFinished() {
        return false;
    }

    /**
     * Shift gearboxes to neutral and set speed to zero.
     */
    protected void end() {
    	new ArmsDisengage();
    	Robot.arms.drive(0, 0);
    }

    /**
     * Release arms if command is interrupted.
     */
    protected void interrupted() {
    	end();
    }
}
