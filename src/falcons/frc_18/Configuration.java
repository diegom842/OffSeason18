package falcons.frc_18;


//import falcons.frc_18.simulation.Simulator;

import java.util.HashMap;

/**
 * Created by Maxwell on 2/1/2017.
 */
public class Configuration {
    public static final boolean FORCE_SIM_REAL = false; //if true, this tells the various sim layer classes that none of their instances should be simulated

    //all the CANTalon indexing goes here
    public static final int DRIVETRAIN_RIGHT_TALON_MASTER_A_IDX = 3;
    public static final int DRIVETRAIN_RIGHT_TALON_SLAVE_B_IDX = 2;
    public static final int DRIVETRAIN_RIGHT_TALON_SLAVE_C_IDX = 1;
    public static final int DRIVETRAIN_LEFT_TALON_MASTER_A_IDX = 16;
    public static final int DRIVETRAIN_LEFT_TALON_SLAVE_B_IDX = 15;
    public static final int DRIVETRAIN_LEFT_TALON_SLAVE_C_IDX = 4;
    public static final int LIFT_TALON1_IDX = 14;
    public static final int LIFT_TALON2_IDX = 12;
    public static final int LIFT_TALON3_IDX = 13;
    public static final int WRIST_TALON_IDX = 9;
    public static final int HARVESTER_TALON_LEFT_IDX = 10;
    public static final int HARVESTER_TALON_RIGHT_IDX = 11;
    public static final int HARVESTER_GRIPPER_TALON_IDX = 9000;
    //All the DIO and analog input config goes here
    public static final int DRIVE_LEFT_ENC_DIO_A = 0;
    public static final int DRIVE_LEFT_ENC_DIO_B = 1;
    public static final int DRIVE_RIGHT_ENC_DIO_A = 2;

//    public static final int LIFT_TALON1_IDX = 11;

    //all the solenoid indexing goes here
    //none bc no pneumatics
    public static final int DRIVE_RIGHT_ENC_DIO_B = 3;
    public static final int LIFT_ENC_DIO_A = 4;
    public static final int LIFT_ENC_DIO_B = 5;
    //    public static final int WRIST_ENC_DIO_A = 25;
//    public static final int WRIST_ENC_DIO_B = 24;
    public static final int WRIST_ENC_DIO_A = 6;
    public static final int WRIST_ENC_DIO_B = 7;
    public static final int GYRO_ANALOG_INDEX = 0;
    public static final int GRABBER_POTENTIOMETER_ANALOG_INDEX = 1;
    public static final boolean DRIVETRAIN_LEFT_OUTPUT_REVERSED = false; //forwards makes the robot drive forwards
    public static final boolean DRIVETRAIN_RIGHT_OUTPUT_REVERSED = false;

    //relays go here

    //none bc no
    //Avoid screwing with this mapping at all costs. It will only make your life harder.
    //and REVERSED isn't true, then the wires are reversed, and need to be resoldered/rewired.
    //to check a motor, apply positive voltage across it, if it spins opposite of what is described as "forwards" for it,
    //list of motors that need reversing, according to how they are mounted, not how the robot acts
    public static final boolean DRIVETRAIN_LEFT_ENCODER_REVERSED = true;
    public static final boolean DRIVETRAIN_RIGHT_ENCODER_REVERSED = true;
    public static final boolean DRIVETRAIN_LEFT_ENCODER_FOLLOWER_REVERSED = true;
    public static final boolean DRIVETRAIN_RIGHT_ENCODER_FOLLOWER_REVERSED = true;


    public static final boolean LIFT_OUTPUT_REVERED = false;
    public static final boolean LIFT_ENCODER_REVERSED = true;
    public static final boolean WRIST_OUTPUT_REVERSED = false;
    public static final boolean WRIST_ENCODER_REVERSED = true;
    public static final double MAX_ACCELERATION = 2.5; // m/s/s
    public static final double MAX_VELOCITY = 3.0; // m/s
    public static final double MAX_ROT_ACCELERATION = 270; // deg/s/s
    public static final double MAX_ROT_VELOCITY = 360; // deg/s
    //debug prefs
    public static final boolean DEBUG_DRIVETRAIN_CONTROL = true; // prints motion control errors to smartDash

    /**
     * creates a new hashmap for the CANTalonSimLayer class, describing which talons should be simulated
     */
//    public static HashMap<Integer, Boolean> getSimmedTalons() {
//        HashMap<Integer, Boolean> toSimOrNotToSim = new HashMap<>();
//        //put the id of the potential talon and whether it should be simmed into the hashmap.
//        toSimOrNotToSim.put(DRIVETRAIN_LEFT_TALON_MASTER_A_IDX, false);
//        toSimOrNotToSim.put(DRIVETRAIN_LEFT_TALON_SLAVE_B_IDX, false);
//        toSimOrNotToSim.put(DRIVETRAIN_LEFT_TALON_SLAVE_C_IDX, false);
//
//        toSimOrNotToSim.put(DRIVETRAIN_RIGHT_TALON_MASTER_A_IDX, false);
//        toSimOrNotToSim.put(DRIVETRAIN_RIGHT_TALON_SLAVE_B_IDX, false);
//        toSimOrNotToSim.put(DRIVETRAIN_RIGHT_TALON_SLAVE_C_IDX, false);
//
//        toSimOrNotToSim.put(LIFT_TALON1_IDX, false);
//        toSimOrNotToSim.put(LIFT_TALON2_IDX, false);
//        toSimOrNotToSim.put(LIFT_TALON3_IDX, false);
//
//        toSimOrNotToSim.put(WRIST_TALON_IDX, false);
//        toSimOrNotToSim.put(HARVESTER_TALON_LEFT_IDX, false);
//        toSimOrNotToSim.put(HARVESTER_TALON_RIGHT_IDX, false);
//        toSimOrNotToSim.put(HARVESTER_GRIPPER_TALON_IDX, true);
//        //if not on robot, sim everything
//        if (Simulator.simType != Simulator.SimType.OFF) {
//            for (Integer key : toSimOrNotToSim.keySet()) {
//                toSimOrNotToSim.put(key, true);
//            }
//        }
//        return toSimOrNotToSim;
//    }
//
//    /**
//     * creates a new hashmap for the SimJoystick class, describing which joystick HIDs should be simulated
//     */
//    public static HashMap<Integer, Boolean> getSimmedJoysticks() {
//        HashMap<Integer, Boolean> toSimOrNotToSim = new HashMap<>();
//        //put the id of the potential joystick and whether it should be simmed into the hashmap.
//        toSimOrNotToSim.put(OI.PILOT_HID_INDEX, false);
//        toSimOrNotToSim.put(OI.COPILOT_HID_INDEX, false);
//        //if not on robot, sim everything
//        if (Simulator.simType != Simulator.SimType.OFF) {
//            for (Integer key : toSimOrNotToSim.keySet()) {
//                toSimOrNotToSim.put(key, true);
//            }
//        }
//        return toSimOrNotToSim;
//    }
}
