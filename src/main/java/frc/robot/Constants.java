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

    //PCM Ports

    //Other Ports
    public static final int xboxPort = 0; //Virtual Port on Laptop

    //Constants
    public static final double throttle = 1; //Maximum Speed during Teleop, 0 to 1
}
