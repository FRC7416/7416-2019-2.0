package frc.robot;

// import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;

import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.*;
//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.cameraserver.CameraServer;

public class Robot extends TimedRobot {
  
  
  public static Drivetrain drivetrain = new Drivetrain();
  public static Lift lift = new Lift();
  public static OI oi;

  @Override
  public void robotInit() { 
    CameraServer.getInstance().startAutomaticCapture();
    oi = new OI();  
  }


  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
  }


  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
   
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
   
  }

  @Override
  public void testPeriodic() {
  }
}
