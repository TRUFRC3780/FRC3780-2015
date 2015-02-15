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

/**
 * Maps ports and channels to variable names.
 */
public interface RobotMap {
    
	int chassis_front_left_drive_channel = 1;
	int chassis_front_right_drive_channel = 2;
	int chassis_rear_left_drive_channel = 3;
	int chassis_rear_right_drive_channel = 4;
	
	int tank_joy_left_port = 1;
	int tank_joy_right_port = 2;
	int op_joy_port = 3;
	
}
