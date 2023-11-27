package frc.robot.Drivetrain;

import org.littletonrobotics.junction.AutoLog;

public interface DrivetrainIO {
    
    @AutoLog
    public static class DrivetrainIOInputs {
        public double leftPositionRads = 0.0;
        public double leftVelocityRadsPerSec = 0.0;
        public double leftVolts = 0.0;
        public double[] leftAmps = new double[] {};

        public double rightPositionRads = 0.0;
        public double rightVelocityRadsPerSec = 0.0;
        public double rightvolts = 0.0;
        public double[] rightAmps = new double[] {};

        public double motorPositionRads = 0.0;
        public double motorVelocityRadsPerSec = 0.0;
        public double motorVolts = 0.0;
        public double[] motorAmps = new double[] {};
       }

    public default void updateInputs(DrivetrainIOInputs inputs) {};

    public default void setVolts(double leftVolts, double rightVolts) {};

    public default void setVolts(double motorVolts) {};

}
