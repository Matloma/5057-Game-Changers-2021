/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

  Victor shooterMotor;
  Servo angleServo;

  /**
   * Creates a new Shooter.
   */
  public Shooter() {
    shooterMotor = new Victor(Constants.shooterMotorPort);
    angleServo = new Servo(Constants.angleServoPort);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shoot(double speed){
    shooterMotor.set(speed);
  }

  public void shootXbox(XboxController xbox, double speed){
    shoot(xbox.getTriggerAxis(Hand.kRight)*speed);
  }

  public void angleUp(){
    angleServo.setAngle(angleServo.getAngle()+2);
  }
  
  public void angleDown(){
    angleServo.setAngle(angleServo.getAngle()-2);
  }

  public void setAngleDistance(){
    
  }
}