package frc.robot.components;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.common.RobotMap;

public class Drive extends Subsystem {
// Drivetrain Subsystem

public Drive(){
    setTankDrive(0,0);
}

// Drive Motors
private VictorSP frontLeftMotor = new VictorSP(RobotMap.FRONT_LEFT_DRIVE_MOTOR);
private VictorSP backLeftMotor = new VictorSP(RobotMap.BACK_LEFT_DRIVE_MOTOR);
private VictorSP frontRightMotor = new VictorSP(RobotMap.FRONT_RIGHT_DRIVE_MOTOR);
private VictorSP backRightMotor = new VictorSP(RobotMap.BACK_RIGHT_DRIVE_MOTOR);

private SpeedControllerGroup leftDrive = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
private SpeedControllerGroup rightDrive = new SpeedControllerGroup(frontRightMotor, backRightMotor);

private DifferentialDrive diffDrive = new DifferentialDrive(leftDrive, rightDrive);

@Override
protected void initDefaultCommand() {

}

public void setTankDrive(double leftPower, double rightPower){
    this.diffDrive.tankDrive(leftPower,rightPower);
}

}

