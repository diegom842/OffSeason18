package falcons.frc_18;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot
{
    Talon rightTalA, rightTalB, rightTalC;
    Talon leftTalA, leftTalB, leftTalC;

    Joystick joy;

    double throttle = 0;
    double rotation = 0;

    @Override
    public void robotInit()
    {
        rightTalA = new Talon(0);
        rightTalB = new Talon(1);
        rightTalC = new Talon(2);

        leftTalA = new Talon(3);
        leftTalB = new Talon(4);
        leftTalC = new Talon(5);

        joy = new Joystick(0);
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void testInit() {

    }

    @Override
    public void robotPeriodic() {


    }

    static int flashState = 0;
    static boolean toggleState = false;
    @Override
    public void disabledPeriodic() {


    }


    public static void updateLEDs()
    {

    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopPeriodic()
    {
        rotation =  -joy.getRawAxis(0);
        throttle = joy.getRawAxis(1);

        leftTalA.set(throttle + rotation);
        leftTalB.set(throttle + rotation);
        leftTalC.set(throttle + rotation);

        rightTalA.set(throttle - rotation);
        rightTalB.set(throttle - rotation);
        rightTalC.set(throttle - rotation);
    }

    @Override
    public void testPeriodic() {
    }
}
