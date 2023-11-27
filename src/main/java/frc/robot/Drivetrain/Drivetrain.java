package frc.robot.Drivetrain;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    
    private final DrivetrainIO io;
    private final DrivetrainIOInputsAutoLogged inputs = new DrivetrainIOInputsAutoLogged();

    public Drivetrain(DrivetrainIO io) {
        this.io = io;
    }

    @Override
    public void periodic() {
        io.updateInputs(inputs);
        Logger.processInputs("Drivetrain", inputs);
    }

    public void arcadeDrive(double forwardSpeed, double turnSpeed) {
        var speeds = DifferentialDrive.arcadeDriveIK(forwardSpeed, turnSpeed, true);
        io.setVolts(speeds.left * 12.0, speeds.right * 12.0);
    }

}
