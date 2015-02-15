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

package org.usfirst.frc.team3780.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team3780.robot.commands.*;

/**
 * Binds controls on the physical operator to commands and command groups.
 */
public class OI {
	
	Joystick tankJoyLeft, tankJoyRight, opJoy;
	
	public OI() {
		
		// initialize drive joysticks
		tankJoyLeft = new Joystick(RobotMap.tank_joy_left_port);
		tankJoyRight = new Joystick(RobotMap.tank_joy_right_port);
		
		// initialize operator joystick
		opJoy = new Joystick(RobotMap.op_joy_port);
		
	}
	
	/**
	 * Returns the drive joysticks.
	 * @return ArrayList of drive joysticks
	 */
	public ArrayList<Joystick> getTankJoys() {
		ArrayList<Joystick> tankJoys = new ArrayList<Joystick>();
		tankJoys.add(0, tankJoyLeft);
		tankJoys.add(1, tankJoyRight);
		return tankJoys;
	}
	
}

