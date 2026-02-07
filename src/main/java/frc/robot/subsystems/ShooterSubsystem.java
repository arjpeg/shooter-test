package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private final MotorController shooterMotor;

    public ShooterSubsystem() {
        shooterMotor = new Spark(0);
        shooterMotor.set(0.75);
    }
}
