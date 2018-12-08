/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveTankMode;

/**
 * Add your docs here.
 */
public class Drivebase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static Drivebase mInstance = null;

  private VictorSP mLeftDriveMotor1;
  private VictorSP mLeftDriveMotor2;
  private VictorSP mLeftDriveMotor3;
  private VictorSP mRightDriveMotor1;
  private VictorSP mRightDriveMotor2;
  private VictorSP mRightDriveMotor3;

  public static Drivebase getInstance() {
    if(mInstance == null) {
      mInstance = new Drivebase();
    }
    return mInstance;
  }

  private Drivebase() {
    mLeftDriveMotor1 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_1);
    mLeftDriveMotor2 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_2);
    mLeftDriveMotor3 = new VictorSP(RobotMap.LEFT_DRIVE_MOTOR_3);

    mRightDriveMotor1 = new VictorSP(RobotMap.RIGHT_DRIVE_MOTOR_1);
    mRightDriveMotor2 = new VictorSP(RobotMap.RIGHT_DRIVE_MOTOR_2);
    mRightDriveMotor3 = new VictorSP(RobotMap.RIGHT_DRIVE_MOTOR_3);    

    mLeftDriveMotor1.setInverted(true);
    mLeftDriveMotor2.setInverted(true);
    mLeftDriveMotor3.setInverted(true);
  }

  public void setSpeedTurn(double speed, double turn) {
    double leftSpeed = speed + turn;
    double rightSpeed = speed - turn;

    setSpeed(leftSpeed, rightSpeed);
  }

  public void setSpeed(double leftSpeed, double rightSpeed) {
    mLeftDriveMotor1.set(leftSpeed);
    mLeftDriveMotor2.set(leftSpeed);
    mLeftDriveMotor3.set(leftSpeed);

    mRightDriveMotor1.set(rightSpeed);
    mRightDriveMotor2.set(rightSpeed);
    mRightDriveMotor3.set(rightSpeed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveTankMode());
  }
}
