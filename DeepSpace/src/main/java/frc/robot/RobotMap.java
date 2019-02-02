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

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {



  public static int DT_FRONTLEFT = 4;
	public static int DT_BACKLEFT = 3;
	public static int DT_FRONTRIGHT = 11;
  public static int DT_BACKRIGHT= 9;
  
  public static int Elevator1 = 6;
  public static int Elevator2 = 7;
  public static int lm1= 1;
  public static int lm2 = 2;

  public static int climberBackRight = 8;
  public static int climberBackLeft = 14;
  public static int climberFrontRight = 15;
  public static int climberFrontLeft = 16;

  public static int intake1 = 12;
  public static int intake2 = 13;

  public static int shoot1 = 17;
  public static int shoot2 = 18;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}