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
 * Engages the arms by shifting the gearboxes to low gear.
 */
public class ArmsEngage extends Command {

    public ArmsEngage() {
        requires(Robot.arms);
    }

    protected void initialize() {
    }

    /**
     * Shift the gearboxes to low gear state.
     */
    protected void execute() {
    	Robot.arms.shift(RobotMap.arms_shifters_low_direction);
    }

    /**
     * Command is finished when solenoid state matches low gear state.
     */
    protected boolean isFinished() {
        return Robot.arms.getState() == RobotMap.arms_shifters_low_direction;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
