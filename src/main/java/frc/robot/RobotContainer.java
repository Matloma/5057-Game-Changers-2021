/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static XboxController xbox;

  private final DriveTrain driveTrain;
  private final DriveXbox driveXbox;

  private final Intake intake;
  private final IntakeXbox intakeXbox;

  private final AutoNav1 autoNav1;

  private SendableChooser<Command> chooser = new SendableChooser<>();

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    xbox = new XboxController(Constants.xboxPort);

    driveTrain = new DriveTrain();
    driveXbox = new DriveXbox(driveTrain);
    driveXbox.addRequirements(driveTrain);
    driveTrain.setDefaultCommand(driveXbox);

    intake = new Intake();
    intakeXbox = new IntakeXbox(intake);
    intakeXbox.addRequirements(intake);
    intake.setDefaultCommand(intakeXbox);

    CommandScheduler.getInstance().registerSubsystem(driveTrain);

    autoNav1 = new AutoNav1(driveTrain);

    chooser.setDefaultOption("AutoNav Course 1", autoNav1);
    //chooser.addOption("AutoNav Course 2", autoNav2);
    //chooser.addOption("AutoNav Course 3", autoNav3);
    SmartDashboard.putData("Autonomous Chooser", chooser);

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // Command selected in SmartDashboard will run in autonomous
    return chooser.getSelected();
  }
}
