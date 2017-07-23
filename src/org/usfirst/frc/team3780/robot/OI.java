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
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3780.robot.commands.*;

/**
 * Binds controls on the physical operator to commands and command groups.
 */
public class OI {
	
	Joystick joystickTankLeft, joystickTankRight, joystickOperator;
	JoystickButton buttonArmsOperate, buttonWinchUp, buttonWinchDown;
	
	public OI() {
		
		// initialize drive joysticks
		joystickTankLeft = new Joystick(RobotMap.joystick_tank_left_port);
		joystickTankRight = new Joystick(RobotMap.joystick_tank_right_port);
		
		// initialize operator joystick
		joystickOperator = new Joystick(RobotMap.joystick_operator_port);
		
		// operate arms
		buttonArmsOperate = new JoystickButton(joystickOperator, RobotMap.button_arms_operate);
		buttonArmsOperate.whileHeld(new ArmsOperate());
		
		// operate winch
		buttonWinchUp = new JoystickButton(joystickOperator, RobotMap.button_winch_up);
		buttonWinchUp.whileHeld(new WinchUp());
		
		buttonWinchDown = new JoystickButton(joystickOperator, RobotMap.button_winch_down);
		buttonWinchDown.whileHeld(new WinchDown());
		
	}
	
	/**
	 * Returns the drive joysticks.
	 * @return ArrayList of drive joysticks
	 */
	public ArrayList<Joystick> getDriveJoysticks() {
		ArrayList<Joystick> driveJoysticks = new ArrayList<Joystick>();
		driveJoysticks.add(0, joystickTankLeft);
		driveJoysticks.add(1, joystickTankRight);
		return driveJoysticks;
	}
	
	public Joystick getDriveJoystick() {
		return joystickTankLeft;
	}
	
}

