/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Drivebase;

public class DriveArcadeMode extends Command {

  private OI mOI = OI.getInstance();
  private Drivebase mDrivebase = Drivebase.getInstance();

  public DriveArcadeMode() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    requires(mDrivebase);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Arcade Mode: Initialize");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    mDrivebase.setSpeedTurn(mOI.mDriverLeftStickY, mOI.mDriverRightStickX);
    System.out.println("Arcade Mode: Execute");
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("Arcade Mode: End");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    mDrivebase.setSpeed(0.0, 0.0);
    System.out.println("Arcade Mode: Interrupted");
  }
}
