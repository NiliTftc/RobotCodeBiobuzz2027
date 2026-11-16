package org.firstinspires.ftc.teamcode;

import static com.sun.tools.doclint.Entity.and;

import com.pedropathing.ivy.Command;
import com.pedropathing.ivy.CommandBuilder;
import com.qualcomm.hardware.lynx.commands.core.LynxSetMotorConstantPowerCommand;

import java.nio.file.attribute.GroupPrincipal;

import dev.nextftc.hardware.RobotController;
import dev.nextftc.hardware.actuators.NextCRServo;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;
import kotlin.time.Instant;

public class IntakeSubsystem implements Mechanism {

    NextMotor Intake = new NextMotor(RobotController.controlHub(), 0);
    NextCRServo LeftTransmitionCRServo = new NextCRServo(RobotController.controlHub(), 0).reverse();
    NextCRServo RightTransmitionCRServo = new NextCRServo(RobotController.controlHub(), 1);
    NextServo LeftRampServo = new NextServo(RobotController.controlHub(), 2);
    NextServo RightRampServo = new NextServo(RobotController.controlHub(), 3);

    public Command IntakePow(double pow) {
        return infinite(() -> Intake.setThrottle(pow));
    }

    public Command IntakeStop() {
        return instant(() -> Intake.setThrottle(0.0));
    }

    public Command TransmitionServosMove(double pow) {
        return infinite(() -> {
            LeftTransmitionCRServo.setPower(pow);
            RightTransmitionCRServo.setPower(pow);
        });
    }

    public Command TransmitionServosStop() {
        return infinite(() -> {
            LeftTransmitionCRServo.setPower(0);
            RightTransmitionCRServo.setPower(0);
        });
    }

    public Command RampServosMove(double pos) {
        return instant(() -> {
            LeftRampServo.setPosition(pos);
            RightRampServo.setPosition(pos);
        });
    }

    public Command FlowerIntake(double pos ,double pow) {
        return instant(() -> {
            RampServosMove(pos);
            IntakePow(pow);
        });
    }

    public Command TransmitionFullWork(double pow) {
        return instant(() -> {
            TransmitionServosMove(pow);
            IntakePow(pow);
        });
    }

    public Command FullStop(double pos) {
        return instant(() -> {
            RampServosMove(pos);
            TransmitionServosMove(0);
            IntakePow(0);
        });
    }
}
