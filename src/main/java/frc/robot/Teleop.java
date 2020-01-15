package frc.robot;

import frc.robot.Robot;
import frc.team5431.titan.core.joysticks.*;

public class Teleop{
    private Xbox driver;

    public Teleop(){
        driver = new Xbox(0);
        driver.setDeadzone(0.10);
    }

    public void periodic(final Robot robot){
        //Tank Drive
        robot.getDrivebase().run(-driver.getRawAxis(Xbox.Axis.LEFT_Y), -driver.getRawAxis(Xbox.Axis.RIGHT_Y));
        
        //Arcade Drive
        //robot.getDrivebase().drive(-driver.getRawAxis(Titan.Xbox.Axis.LEFT_X)*.4 + driver.getRawAxis(Titan.Xbox.Axis.LEFT_Y), driver.getRawAxis(Titan.Xbox.Axis.LEFT_X)*.4+ driver.getRawAxis(Titan.Xbox.Axis.LEFT_Y));
        
    }

    public Xbox getDriver(){
        return driver;
    }
}