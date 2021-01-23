/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  
  private WPI_TalonSRX frontLeft;
  private WPI_TalonSRX rearLeft;
  private WPI_TalonSRX frontRight;
  private WPI_TalonSRX rearRight;

  private MecanumDrive driveTrain;

  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    frontLeft = new WPI_TalonSRX(0);
    rearLeft = new WPI_TalonSRX(1);
    frontRight = new WPI_TalonSRX(2);
    rearRight = new WPI_TalonSRX(3);

    driveTrain = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double ySpeed, double xSpeed, double zRotation){
    driveTrain.driveCartesian(ySpeed, xSpeed, zRotation);
  }

  public void driveXbox(XboxController xbox, double speed){
    drive(-xbox.getY(Hand.kLeft)*speed, xbox.getX(Hand.kLeft)*speed, xbox.getX(Hand.kRight)*speed);
  }

  public void stop(){
    driveTrain.driveCartesian(0, 0, 0);
  }

}
