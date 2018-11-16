package falcons.frc_18;
//
//import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import falcons.frc.simulation.SimJoystick;
//import falcons.frc.command_system.bool_checks.AnalogJoyBCheck;
//import falcons.frc.command_system.bool_checks.ButtonBCheck;
//import falcons.frc.command_system.bool_checks.DPadBCheck;
//import falcons.frc_18.commands.*;
//import falcons.frc_18.commands.autos_vegas.CmdAutoScaleRightLeftRev2;
//import falcons.frc_18.commands.calibration.CmdCal2290;
//import falcons.frc_18.commands.calibration.CmdCal5mStraight;
//import falcons.frc_18.control.Control;
//import falcons.generic.command_system.ChangeWatchdog;
//import javafx.scene.control.TextFormatter;
//
//import static falcons.frc_18.commands.CmdSetScalevatorPos.ScalevatorPos;
//
///**
// * Created by Maxwell on 2/1/2017.
// */
public class OI
{
//    public static final int PILOT_HID_INDEX = 0;
//    public static final int COPILOT_HID_INDEX = 1;
//    public static final int AUTO_BUTTON_IDX = 2;
//    public static final int REC_BUTTON_IDX = 3;
//    public static final int DRIVER_EJECT_BTN = 3;
//    //Pilot
//    private static final int THROTTLE_AXIS_IDX = 0;
//    private static final boolean REV_THROTTLE_AXIS = false;
//    private static final int ROTATION_AXIS_IDX = 1;
//    private static final boolean REV_ROTATION_AXIS = false;
//
//    //Copilot
//    //EXAMPLE: private static final int TOWER_A_ASTICK_IDX = 2;
//    private static final int LIFT__THROTTLE_AXIS_IDX = 1; //Left joy, up down
//    private static final boolean REV_LIFT_THROTTLE = true;
//
//    private static final int WRIST_ROTATION_AXIS_IDX = 3; //Right joy, up down
//    private static final boolean REV_WRIST_ROTATION_AXIS = false;
//
//    // Joystick Up is Negative on Gamepads
//    // Joystick Down is Positive on Gamepads
//    // Joystick Right is Positive on Gamepads
//    // Joystick Left is Negative on Gamepads
//    private static final int AXIS_LEFT_X = 0;
//    private static final int AXIS_LEFT_Y = 1;
//    private static final int AXIS_Right_X = 2;
//    private static final int AXIS_RIGHT_Y = 3;
//
//    //Left and right triggers on replacement controller are axes
//    private static final int SHIFT_ONE_TRIGGER = 3;
//    private static final int SET_DRIVER_EJECT_HARD_TRIGGER = 2;
//
//    //Button Mappings
//    private static final int HARD_EJECT_BTN = 3;//1;
//    private static final int RUN_INTAKE_BTN = 1;//2;
//    private static final int SOFT_EJECT_BTN = 2;//3;
//    private static final int SWITCH_BTN = 4;
//
//    //Left buttons/triggers
//    private static final int SET_DRIVER_EJECT_SOFT_BTN = 5;
//    private static final int SET_DRIVER_EJECT_HARD_BTN = 7;
//
//    //Right buttons/triggers
//    private static final int SHIFT_ONE_BTN = 6;
//    private static final int SHIFT_TWO_BTN = 8;
//
//    //Middle buttons
//    private static final int CLIMB_1_BTN = 7;//9;
//    private static final int CLIMB_2_BTN = 8;//10;
//
//    private static OI m_instance;
//
//    public SimJoystick pilotHID; //human interface device for the pilot
//    public SimJoystick copilotHID; //gamepad
//    public DriverHarvesterMode driverHarvesterMode;
//
//    private OI()
//    {
//        pilotHID = new SimJoystick(PILOT_HID_INDEX);
//        copilotHID = new SimJoystick(COPILOT_HID_INDEX);
//
//        driverHarvesterMode = DriverHarvesterMode.SOFT;
//
//        this.generateCommands();
//    }
//
//    public static OI getInstance()
//    {
//        if (m_instance == null) m_instance = new OI();
//        return m_instance;
//    }
//
//    /**
//     * This function constructs and initializes all the commands that the operators can trigger with their controller
//     */
//    public void generateCommands()
//    {
//
////        ChangeWatchdog liftUpWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, HARV_FEED_BTN));
////        liftUpWD.runWhileTrue(new CmdSetLift(true, true));
////        liftUpWD.runOnFalse(new CmdSetLift(false, false));
////
////        ChangeWatchdog liftDownWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, HARV_VOMIT_BTN));
////        liftDownWD.runWhileTrue(new CmdSetLift(true, false));
////        liftDownWD.runOnFalse(new CmdSetLift(false, false));
//
//        /**
//         *DPAD BUTTON MAPPINGS
//         */
//        // Left DPad Up
//        ChangeWatchdog setScaleHighWD = new ChangeWatchdog(new DPadBCheck(copilotHID, DPadBCheck.DPadDirection.NORTH));
//        setScaleHighWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_FWD_HIGH, true));
//
//        // Left DPad Down
//        ChangeWatchdog setGroundWD = new ChangeWatchdog(new DPadBCheck(copilotHID, DPadBCheck.DPadDirection.SOUTH));
//        setGroundWD.runOnTrue(new CmdSetShift(CmdSetShift.SHIFTED_AMOUNT.SHIFTED_ZERO));
//        setGroundWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.GROUND, true));
//        setGroundWD.runOnFalse(new CmdSetScalevatorPos(ScalevatorPos.FOLDED, true));
//
//        // Left DPad Left
//        ChangeWatchdog setScaleMidWD = new ChangeWatchdog(new DPadBCheck(copilotHID, DPadBCheck.DPadDirection.WEST));
//        setScaleMidWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_FWD_MID, true));
//
//        // Left DPad Right
//        ChangeWatchdog setScaleLowWD = new ChangeWatchdog(new DPadBCheck(copilotHID, DPadBCheck.DPadDirection.EAST));
//        setScaleLowWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_FWD_LOW, true));
//
//        /**
//         * LEFT JOYSTICK MAPPINGS
//         */
//        // Left Joy Up
//        ChangeWatchdog setScaleHighRevWD = new ChangeWatchdog(new AnalogJoyBCheck(copilotHID, AXIS_LEFT_Y, -2, -.5));
//        setScaleHighRevWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_REV_HIGH));
//
//        // Left Joy Down
//        ChangeWatchdog setGroundJoyWD = new ChangeWatchdog(new AnalogJoyBCheck(copilotHID, AXIS_LEFT_Y, .5, 2));
//        setGroundJoyWD.runOnTrue(new CmdSetShift(CmdSetShift.SHIFTED_AMOUNT.SHIFTED_ZERO));
//        setGroundJoyWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.FOLDED));
//        setGroundJoyWD.runOnFalse(new CmdSetScalevatorPos(ScalevatorPos.GROUND));
//
//        // Left Joy Left
//        ChangeWatchdog setScaleMidRevWD = new ChangeWatchdog(new AnalogJoyBCheck(copilotHID, AXIS_LEFT_X, -2, -.5));
//        setScaleMidRevWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_REV_MID));
//
//        // Left Joy Right
//        ChangeWatchdog setScaleLowRevWD = new ChangeWatchdog(new AnalogJoyBCheck(copilotHID, AXIS_LEFT_X, .5, 2));
//        setScaleLowRevWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SCALE_REV_LOW));
//
//        /**
//         * BUTTON MAPPINGS
//         */
//
//        // Button 1 Soft Eject
//        ChangeWatchdog softEjectWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SOFT_EJECT_BTN));
//        softEjectWD.runOnTrue(new CmdSetHarv(CmdSetHarv.HarvesterMode.EJECT_SOFT));
//        softEjectWD.runOnFalse(new CmdSetHarv(CmdSetHarv.HarvesterMode.OFF));
//
//        // Button 2 Intake Harvester
//        ChangeWatchdog intakeWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, RUN_INTAKE_BTN));
//        intakeWD.runOnTrue(new CmdSetHarv(CmdSetHarv.HarvesterMode.INTAKE_HARD));
//        intakeWD.runOnFalse(new CmdSetHarv(CmdSetHarv.HarvesterMode.OFF));
//
//        // Button 3 Hard Eject
//        ChangeWatchdog hardEjectWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, HARD_EJECT_BTN));
//        hardEjectWD.runOnTrue(new CmdSetHarv(CmdSetHarv.HarvesterMode.EJECT_HARD));
//        hardEjectWD.runOnFalse(new CmdSetHarv(CmdSetHarv.HarvesterMode.OFF));
//
//        // Button 4 Switch Height
//        ChangeWatchdog switchWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SWITCH_BTN));
//        switchWD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.SWITCH, true));
//
//        // Button 5 Set Driver Eject Mode Soft
//        ChangeWatchdog setDriverEjectSoftWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SET_DRIVER_EJECT_SOFT_BTN));
//        setDriverEjectSoftWD.runOnTrue(new CmdSetDriverEjectMode(DriverHarvesterMode.SOFT));
//
//        // Button 7 Set Driver Eject Mode Hard
//        ChangeWatchdog setDriverEjectHardWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SET_DRIVER_EJECT_HARD_BTN));
//        setDriverEjectHardWD.runOnTrue(new CmdSetDriverEjectMode(DriverHarvesterMode.HARD));
//
//        // Button 6 Shift One Cube Up
//        ChangeWatchdog setShiftOneWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SHIFT_ONE_BTN));
//        setShiftOneWD.runOnTrue(new CmdSetShift(CmdSetShift.SHIFTED_AMOUNT.SHIFTED_UP));
//
//        /**
//         * Left Trigger 3 is an AXIS and shifts one cube down
//         */
//        ChangeWatchdog setShiftDownWD = new ChangeWatchdog(new AnalogJoyBCheck(copilotHID, SHIFT_ONE_TRIGGER, .5, 2));
//        setShiftDownWD.runOnTrue(new CmdSetShift(CmdSetShift.SHIFTED_AMOUNT.SHIFTED_DOWN));
//
//        //Button 8 Shift Two Cubes Up
//        //ChangeWatchdog setShiftTwoWD = new ChangeWatchdog(new ButtonBCheck(copilotHID, SHIFT_TWO_BTN));
//        //setShiftTwoWD.runOnTrue(new CmdSetShift(CmdSetShift.SHIFTED_AMOUNT.SHIFTED_DOWN));
//
//        // Driver Ejects soft or hard depending on co pilot
//        ChangeWatchdog driverEjectWD = new ChangeWatchdog(new ButtonBCheck(pilotHID, DRIVER_EJECT_BTN));
//        driverEjectWD.runOnTrue(new CmdSetPilotHarv());
//        driverEjectWD.runOnFalse(new CmdSetHarv(CmdSetHarv.HarvesterMode.OFF));
//
//        // Driver Ejects soft or hard depending on co pilot
//        ChangeWatchdog scaleControlWD = new ChangeWatchdog(new ButtonBCheck(pilotHID, 1));
//        scaleControlWD.runOnTrue(new CmdSetScalavatorControlMode(Control.ScalavatorMode.MANUAL));
//        scaleControlWD.runOnFalse(new CmdSetScalavatorControlMode(Control.ScalavatorMode.CLOSED_LOOP));
//
//        ChangeWatchdog liftControl1WD = new ChangeWatchdog(new ButtonBCheck(copilotHID, CLIMB_1_BTN));
//        liftControl1WD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.CLIMB_HIGH, true));
//
//
//        ChangeWatchdog liftControl2WD = new ChangeWatchdog(new ButtonBCheck(copilotHID, CLIMB_2_BTN));
//        liftControl2WD.runOnTrue(new CmdSetScalevatorPos(ScalevatorPos.CLIMB_LOW));
//
//        ChangeWatchdog recWD = new ChangeWatchdog(new ButtonBCheck(pilotHID, AUTO_BUTTON_IDX));
//        //recWD.runWhileTrue(new CmdCal5mStraight());
//        //recWD.runWhileTrue(new CmdCal5mStraight());
//        //recWD.runWhileTrue(new CmdCal2mStraight());
//        //recWD.runWhileTrue(new CmdAutoScaleRightLeftRev2(false));
//        recWD.runWhileTrue(new CmdCal5mStraight());
//
//        recWD.runOnFalse(new CmdSetDrivetrainMode(Control.DrivetrainControlMode.OP_CONTROL));
//        //recWD.runOnTrue(new CmdLogAThing("Recording Motion...", true));
//        //recWD.runOnFalse(new CmdLogAThing("Finished Recording", true));
//    }
//
//    /**
//     * gets the throttle channel from the driver, +1 mean 100% forwards -1 means 100% backwards
//     *
//     * @return the throttle channel from the driver
//     */
//    public float getDriveThrottle()
//    {
//        SmartDashboard.putNumber("lift joy", (copilotHID.getRawAxis(LIFT__THROTTLE_AXIS_IDX) * (REV_LIFT_THROTTLE ? -1 : 1)));
//
//        return ((float) pilotHID.getRawAxis(THROTTLE_AXIS_IDX)) * ((REV_THROTTLE_AXIS) ? (-1) : (1));
//
//    }
//
//    /**
//     * gets the rotation channel from the driver, +1 means 100% clockwise, -1 means 100% CCW
//     *
//     * @return
//     */
//    public float getDriveRotation()
//    {
//        return ((float) pilotHID.getRawAxis(ROTATION_AXIS_IDX) * ((REV_ROTATION_AXIS) ? (-1) : (1)));
//    }
//
//    /**
//     * Gets the left joystick vertical axis value to control up and down movement, +1 goes up, -1 goes down
//     *
//     * @return left joystick vertical value
//     */
//    public float getWristOpHeading()
//    {
//        return ((float) copilotHID.getRawAxis(WRIST_ROTATION_AXIS_IDX) * (REV_WRIST_ROTATION_AXIS ? -1 : 1)); //TODO: Possible multiplier
//    }
//
//    /**
//     * Gets the right joystick vertical axis value to control lift's up and down movement, +1 goes up and -1 goes down
//     *
//     * @return right joystick vertical value
//     */
//    public float getLiftOpThrottle()
//    {
//
//        return ((float) copilotHID.getRawAxis(LIFT__THROTTLE_AXIS_IDX) * (REV_LIFT_THROTTLE ? -1 : 1)); //TODO: Possible multiplier
//
//    }
//
//    public enum DriverHarvesterMode
//    {
//        SOFT,
//        HARD
//    }
}