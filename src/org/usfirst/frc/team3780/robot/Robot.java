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

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team3780.robot.subsystems.*;

/**
 * Functions in this class are called according to mode.
 */
public class Robot extends IterativeRobot {

	// initialize subsystems
	public static final Chassis chassis = new Chassis();
	public static final Arms arms = new Arms();
	public static final Winch winch = new Winch();
	
	// initialize OI
	public static OI oi;
	
	// TODO: write autonomous
	// Command autonomousCommand;

    public void robotInit() {
		oi = new OI();
		
        // run autonomous
        // autonomousCommand = new AutonomousCommand();
		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        // if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	// Ensure autonomous stops when teleop begins
        // if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void disabledInit(){

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
    
}
