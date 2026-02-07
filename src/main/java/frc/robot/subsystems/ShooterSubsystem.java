package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private final MotorController motor = new Spark(35);

    public void setPower(double power) {
        motor.set(power);
    }

    public void stop() {
        motor.stopMotor();
    }
}
