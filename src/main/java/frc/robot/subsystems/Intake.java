/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  Victor intakeMotor;
  DoubleSolenoid piston1;
  DoubleSolenoid piston2;
  boolean isDown = false;

  /**
   * Creates a new Intake.
   */
  public Intake() {
    intakeMotor = new Victor(Constants.intakeMotorPort);
    piston1 = new DoubleSolenoid(Constants.intakePistonPort1, Constants.intakePistonPort2);
    piston2 = new DoubleSolenoid(Constants.intakePistonPort3, Constants.intakePistonPort4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake(double speed){
    intakeMotor.set(speed);
  }

  public void intakeXbox(XboxController xbox, double speed){
    intake(xbox.getTriggerAxis(Hand.kLeft)*speed);
  }

  public void stop(){
    intakeMotor.set(0);
  }

  public void intakeUp(){
    piston1.set(Value.kReverse);
    piston2.set(Value.kReverse);
    isDown = false;
  }

  public void intakeDown(){
    piston1.set(Value.kForward);
    piston2.set(Value.kForward);
    isDown = true;
  }

  public boolean switchIntake(){
    if(isDown){
      intakeUp();
    } else {
      intakeDown();
    }
    return isDown;
  }

  public void switchIntakeXbox(XboxController xbox){
    if(xbox.getYButtonPressed()){
      switchIntake();
    }
  }
}
