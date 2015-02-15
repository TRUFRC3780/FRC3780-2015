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
 * Controls the robot's two unidirectional arms.
 */
public class Arms extends Subsystem {
    
	Talon leftArm, rightArm;
	RobotDrive armDrive;
	DoubleSolenoid shifters;
	
    public Arms () {
    	leftArm = new Talon(RobotMap.arms_left_arm_channel);
    	rightArm = new Talon(RobotMap.arms_right_arm_channel);
    	armDrive = new RobotDrive(leftArm, rightArm);
    	shifters = new DoubleSolenoid(RobotMap.arms_shifters_forward_channel, RobotMap.arms_shifters_reverse_channel);
    }
    
    /**
     * Set the speed of the motors driving the arms.
     * @param sLeft left arm speed
     * @param sRight right arm speed
     */
    public void drive(double sLeft, double sRight) {
    	armDrive.setLeftRightMotorOutputs(sLeft, sRight);
    }
    
    /**
     * Shifts the arms' gearboxes. (low / neutral)
     * @param d direction
     */
    public void shift(DoubleSolenoid.Value d) {
    	shifters.set(d);
    }
    
    /**
     * Returns the state of the solenoid
     * @return state of the solenoid
     */
    public DoubleSolenoid.Value getState() {
    	return shifters.get();
    }

    public void initDefaultCommand() {
    }
}

