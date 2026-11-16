package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.TeleopStaff.IntakeMechanism;
import java.util.Set;
import dev.nextftc.robot.Mechanism;

public class Robot {
    public interface NextRobot {
        IntakeMechanism INTAKE_MECHANISM = new IntakeMechanism();

        default void periodic() {}
        default Set<Mechanism> getMechanisms() {
            return Set.of(INTAKE_MECHANISM);
        }
    }
}
