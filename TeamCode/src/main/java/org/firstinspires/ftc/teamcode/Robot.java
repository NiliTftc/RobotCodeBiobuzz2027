package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.TeleOp_Hellen.LLMechanism;
import org.firstinspires.ftc.teamcode.TeleOp_Hellen.TurretMechanism;
import org.firstinspires.ftc.teamcode.TeleopStaff.IntakeMechanism;

import java.util.Set;

import dev.nextftc.robot.Mechanism;

public class Robot {
    public interface NextRobot {
        LLMechanism LL_MECHANISM = new LLMechanism();
        TurretMechanism TURRET_MECHANISM_LL = new TurretMechanism();

        IntakeMechanism INTAKE_MECHANISM = new IntakeMechanism();

        default void periodic() {}
        default Set<Mechanism> getMechanisms() {
            return Set.of(LL_MECHANISM, (Mechanism) TURRET_MECHANISM_LL, INTAKE_MECHANISM);
        }
    }
}
