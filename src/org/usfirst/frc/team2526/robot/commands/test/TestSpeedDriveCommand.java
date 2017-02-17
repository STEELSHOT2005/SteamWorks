package org.usfirst.frc.team2526.robot.commands.test;

import org.usfirst.frc.team2526.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TestSpeedDriveCommand extends Command {
	private int speed;
	
	/*
	 * @param Speed in rotations per minute (RPM).
	 */
	public TestSpeedDriveCommand(int speed){
		this.speed = speed;
	}
	protected void execute() {
		Robot.driveTrain.speedDrive(speed, speed);
		Robot.driveTrain.printSpeedToDebug();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}