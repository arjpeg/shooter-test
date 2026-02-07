package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootCommand extends Command {
    private final ShooterSubsystem m_shooter;
    private final double m_power;

    /**
     * Creates a new ShootCommand.
     *
     * @param subsystem The subsystem used by this command for managing the shooter.
    */
    public ShootCommand(ShooterSubsystem shooter, double power) {
        m_shooter = shooter;
        m_power = power;

        addRequirements(shooter);
    }

    @Override
    public void execute() {
        m_shooter.setPower(m_power);
    }

    @Override
    public void end(boolean interrupted) {
        m_shooter.stop();
    }
}
