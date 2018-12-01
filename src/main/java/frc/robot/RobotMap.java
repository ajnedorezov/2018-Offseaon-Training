/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static final int LEFT_DRIVE_MOTOR_1 = 0;
  public static final int LEFT_DRIVE_MOTOR_2 = 1;
  public static final int LEFT_DRIVE_MOTOR_3 = 2;

  public static final int RIGHT_DRIVE_MOTOR_1 = 3;
  public static final int RIGHT_DRIVE_MOTOR_2 = 4;
  public static final int RIGHT_DRIVE_MOTOR_3 = 5;

  public static final int DRIVER_CONTROLLER_PORT = 0;
  public static final int OPERATOR_CONTROLLER_PORT = 1;

  public static final int XBOX_BUTTON_A_PORT = 1;
  public static final int XBOX_BUTTON_B_PORT = 2;
  public static final int XBOX_BUTTON_X_PORT = 3;
  public static final int XBOX_BUTTON_Y_PORT = 4;
  public static final int XBOX_BUTTON_LB_PORT = 5;
  public static final int XBOX_BUTTON_RB_PORT = 6;
  public static final int XBOX_LEFT_STICK_PORT = 9;
  public static final int XBOX_RIGHT_STICK_PORT = 10;

  public static final int XBOX_LEFT_STICK_AXIS_X = 0;
  public static final int XBOX_LEFT_STICK_AXIS_Y = 1;
  public static final int XBOX_RIGHT_STICK_AXIS_X = 4;
  public static final int XBOX_RIGHT_STICK_AXIS_Y = 5;

}
