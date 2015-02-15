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

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Controls the winch lifting the arms up and down.
 */
public class Winch extends Subsystem {
    
	Talon winch;
	
	public Winch() {
		winch = new Talon(RobotMap.winch_channel);
	}
	
	/**
	 * Drives the winch.
	 * @param s speed
	 */
	public void drive(double s) {
		winch.set(s);
	}
	
    public void initDefaultCommand() {
    }
}

