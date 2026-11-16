package org.firstinspires.ftc.teamcode.RobotData;

import org.firstinspires.ftc.teamcode.Mechanisms.IntakeMechanism;
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
