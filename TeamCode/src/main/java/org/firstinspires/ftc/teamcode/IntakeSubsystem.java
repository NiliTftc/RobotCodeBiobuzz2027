package org.firstinspires.ftc.teamcode;

import static com.sun.tools.doclint.Entity.and;

import com.pedropathing.ivy.Command;
import com.pedropathing.ivy.CommandBuilder;
import com.qualcomm.hardware.lynx.commands.core.LynxSetMotorConstantPowerCommand;

import java.nio.file.attribute.GroupPrincipal;
import java.time.Instant;

import dev.nextftc.hardware.RobotController;
import dev.nextftc.hardware.actuators.NextCRServo;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;

public class IntakeSubsystem implements Mechanism {

    NextMotor Intake = new NextMotor(RobotController.controlHub(), 0);
    NextCRServo LeftTransmitionServo = new NextCRServo(RobotController.controlHub(), 0).reverse();
    NextCRServo RigtTransmitionServo = new NextCRServo(RobotController.controlHub(), 1);
    NextServo LeftRampServo = new NextServo(RobotController.controlHub(), 2);
    NextServo RightRampServo = new NextServo(RobotController.controlHub(), 3);

    public Command IntakePow(double pow) {
        return infinite(() -> Intake.setThrottle(pow));
    }

    public Command IntakeStop() {
        return instant(() -> Intake.setThrottle(0.0));
    }

//    public Command CRServoMove(double pos) {
//        return new ;
//
//    }



}
