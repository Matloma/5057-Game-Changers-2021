/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //CAN Ports
    public static final int frontLeftPort = 0; //Virtual Port on CAN chain
    public static final int rearLeftPort = 1; //Virtual Port on CAN chain
    public static final int frontRightPort = 2; //Virtual Port on CAN chain
    public static final int rearRightPort = 3; //Virtual Port on CAN chain
    //PWM Ports
    public static final int intakeMotorPort = 0; //Physical Port for Victor
    public static final int shooterMotorPort = 1; //Physical Port for Victor
    public static final int angleServoPort = 2; //Physical Port for Servo

    //PCM Ports
    public static final int intakePistonPort1 = 0; //Physical Port on PCM for Solenoid
    public static final int intakePistonPort2 = 1; //Physical Port on PCM for Solenoid
    public static final int intakePistonPort3 = 2; //Physical Port on PCM for Solenoid
    public static final int intakePistonPort4 = 3; //Physical Port on PCM for Solenoid

    //Analog Ports
    public static final int ultrasonicAnalogPort = 0; //Physical Port for RangeFinder

    //Other Ports
    public static final int xboxPort = 0; //Virtual Port on Laptop

    //Constants
    public static final double throttle = 1; //Maximum Speed during Teleop, 0 to 1
    public static final double autonomousSpeed = 0.5; //Maximum Speed during Autonomous, 0 to 1
    public static final double intakeMaxSpeed = 0.5; //Maximum Speed for Intake, 0 to 1
    public static final double rangeFinderVoltsToCM = 512.0/5.0*24.0/23.0; //Scaling Factor to turn Volts from Ultrasonic Sensor to a distance in Centimeters


}
