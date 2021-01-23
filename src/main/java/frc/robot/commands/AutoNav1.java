/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.*;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutoNav1 extends SequentialCommandGroup {
  /**
   * Creates a new AutoNav1.
   */
  public AutoNav1(DriveTrain driveTrain) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new DriveTimed(driveTrain, 2, 1, -0.2, 0), 
          new DriveTimed(driveTrain, 1.5, .5, .6, 0),
          new DriveTimed(driveTrain, 1, 0.7, -0.3, 0),
          new DriveTimed(driveTrain, 1, 1, 0, 0)
    );
  }
}
