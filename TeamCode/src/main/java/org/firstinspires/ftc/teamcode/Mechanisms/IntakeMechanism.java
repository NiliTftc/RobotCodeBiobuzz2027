//package org.firstinspires.ftc.teamcode.Mechanisms;
//
//import com.pedropathing.ivy.Command;
//
//import dev.nextftc.hardware.actuators.NextCRServo;
//import dev.nextftc.hardware.actuators.NextMotor;
//import dev.nextftc.hardware.actuators.NextServo;
//import dev.nextftc.robot.Mechanism;
//
//public class IntakeMechanism implements Mechanism {
//
//    NextMotor Intake = new NextMotor("0C");
//    NextCRServo LeftTransmitionCRServo = new NextCRServo("00C").reverse();
//    NextCRServo RightTransmitionCRServo = new NextCRServo("01C");
//    NextServo LeftRampServo = new NextServo("02C");
//    NextServo RightRampServo = new NextServo("03C");
//
//    public Command initialize() {
//        return instant(()-> Intake.setZeroPowerBehavior(NextMotor.ZeroPowerBehavior.FLOAT));
//    }
//
//    public Command IntakePow(double pow) {
//        return infinite(() -> Intake.setThrottle(pow));
//    }
//
//    public Command IntakeStop() {
//        return instant(() -> Intake.setThrottle(0.0));
//    }
//
//    public Command TransmitionServosMove(double pow) {
//        return infinite(() -> {
//            LeftTransmitionCRServo.setPower(pow);
//            RightTransmitionCRServo.setPower(pow);
//        });
//    }
//
//    public Command TransmitionServosStop() {
//        return infinite(() -> {
//            LeftTransmitionCRServo.setPower(0);
//            RightTransmitionCRServo.setPower(0);
//        });
//    }
//
//    public Command RampServosMove(double pos) {
//        return instant(() -> {
//            LeftRampServo.setPosition(1 - pos);
//            RightRampServo.setPosition(pos);
//        });
//    }
//
//    public Command FlowerIntake(double pos ,double pow) {
//        return instant(() -> {
//            RampServosMove(pos);
//            IntakePow(pow);
//        });
//    }
//
//    public Command TransmitionFullWork(double Tpow, double Ipow) {
//        return instant(() -> {
//            TransmitionServosMove(Tpow);
//            IntakePow(Ipow);
//        });
//    }
//
//    public Command FullStop(double pos) {
//        return instant(() -> {
//            RampServosMove(pos);
//            TransmitionServosMove(0);
//            IntakeStop();
//        });
//    }
//}
