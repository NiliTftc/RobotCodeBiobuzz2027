package org.firstinspires.ftc.teamcode.Mechanisms;

import com.pedropathing.ivy.Command;

import dev.nextftc.hardware.RobotController;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.actuators.NextServo;
import dev.nextftc.robot.Mechanism;

public class ShooterMechanism implements Mechanism {
    NextMotor ShooterPollen = new NextMotor(RobotController.controlHub(), 1);
    NextMotor ShooterNectar = new NextMotor(RobotController.controlHub(), 2);
    NextServo PollenServo = new NextServo(RobotController.controlHub(), 4);
    NextServo NectarServo = new NextServo(RobotController.controlHub(), 5);


    public Command ShooterPollenPow(double pow) {return infinite(()-> ShooterPollen.setThrottle(pow));}
    public Command ShooterPollenStop() {return instant(()-> ShooterPollen.setThrottle(0.0));}

    public Command ShooterNectarPow(double pow) {return infinite(()-> ShooterNectar.setThrottle(pow));}
    public Command ShooterNectarStop() {return instant(()-> ShooterNectar.setThrottle(0.0));}

    public Command PollenServoMove(double pos) {
        return instant(()-> { PollenServo.setPosition(pos);});
    }
    public Command NectarServoMove(double pos) {
        return instant(()-> { NectarServo.setPosition(pos);});
    }

    public Command PollenServoZero() {
        return instant(()-> { PollenServo.setPosition(0.0);});
    }
    public Command NectarServoZero() {
        return instant(()-> { NectarServo.setPosition(0.0);});
    }
}
