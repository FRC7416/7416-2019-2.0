
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.LIDAR;
public class DriveArcade extends Command {
  private LIDAR lidar = new LIDAR();
  public DriveArcade() {
    requires(Robot.drivetrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    //I belive this is where all button-press commands should go.



    System.out.println(lidar.getDistance());
    //Robot.drivetrain.driveArcade(Robot.oi.getMultiplier(Robot.oi.getFstickX(),Robot.oi.getFThrottle()), Robot.oi.getMultiplier(Robot.oi.getFstickY(),Robot.oi.getFThrottle()));
    Robot.drivetrain.driveArcade(Robot.oi.getMultiplier(Robot.oi.getFstickY(),Robot.oi.getFThrottle()), Robot.oi.getMultiplier(Robot.oi.getFstickX(),Robot.oi.getFThrottle()));

    
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
