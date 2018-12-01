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

public class DriveTankMode extends Command {

  private OI mOI = OI.getInstance();
  private Drivebase mDrivebase = Drivebase.getInstance();

  public DriveTankMode() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    requires(Drivebase.getInstance());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    mDrivebase.setSpeed(mOI.mDriverLeftStickY, mOI.mDriverRightStickY);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    mDrivebase.setSpeed(0.0, 0.0);
  }
}
