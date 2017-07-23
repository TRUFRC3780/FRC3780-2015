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

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Maps ports and channels to variable names.
 */
public interface RobotMap {
    
	// CHASSIS
	
	int chassis_front_left_drive_channel = 0;
	int chassis_front_right_drive_channel = 1;
	int chassis_rear_left_drive_channel = 2;
	int chassis_rear_right_drive_channel = 3;
	
	// ARMS
	
	int arms_left_arm_channel = 4;
	int arms_right_arm_channel = 5;
	double arms_left_arm_speed = 0.5;
	double arms_right_arm_speed = 0.5;
	
	int arms_shifters_forward_channel = 1;
	int arms_shifters_reverse_channel = 2;
	DoubleSolenoid.Value arms_shifters_low_direction = DoubleSolenoid.Value.kForward;
	DoubleSolenoid.Value arms_shifters_neutral_direction = DoubleSolenoid.Value.kReverse;
	
	// WINCH
	
	int winch_channel = 6;
	double winch_up_speed = 0.5;
	double winch_down_speed = -0.5;
	
	// JOYSTICKS
	
	int joystick_tank_left_port = 0;
	int joystick_tank_right_port = 9;
	int joystick_operator_port = 2;
	
	// BUTTONS
	
	int button_arms_operate = 1; // trigger
	int button_winch_up = 3; // top button
	int button_winch_down = 2; // bottom button
	int button_auto = 6;
	
	// AUTONOMOUS
	
	// drive forward
	double autonomous_drive_forward_time = 3.0;
	double autonomous_drive_forward_speed = 0.4;
	
	
	// dance!
	int autonomous_dance_iterations = 16;
	double autonomous_dance_speed = 0.6;
	double autonomous_dance_interval = 0.6;
}
