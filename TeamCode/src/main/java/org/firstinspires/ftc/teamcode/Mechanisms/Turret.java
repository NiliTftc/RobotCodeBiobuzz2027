package org.firstinspires.ftc.teamcode.Mechanisms;


import com.pedropathing.ivy.Command;

import dev.nextftc.control.feedback.PIDController;
import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.Telemetry;


public class Turret implements Mechanism {

    double offset = 0;
//    NextDigitalSensor magnet = new NextDigitalSensor("magnet");

    NextMotor turretLL = new NextMotor("3C");

    PIDController pid = new PIDController(new dev.nextftc.control.feedback.PIDCoefficients(
            0.01, 0.0, 0.001
    ));

    public Command initialize() {
        return infinite(()-> turretLL.setZeroPowerBehavior(NextMotor.ZeroPowerBehavior.BRAKE));
    }

//    public boolean isMagnetPressed(){
//        return magnet.isTriggered();
//    }

    public Command tryout(double pow) {
        return instant(()-> turretLL.setThrottle(pow));
    }

    @Override
    public void periodic() {
        Telemetry.log("pid error: ", pid.getCoefficients());
        Telemetry.log("pid error: ", pid.getLastError());
        Telemetry.log("turret encoder pos (radians): ", turretLL.getAbsoluteEncoderPosition());
        Telemetry.log("turret pow: ", turretLL.getThrottle());

        Telemetry.update();
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public Command moveError(double tx) {
//        return infinite(()-> turretLL.setPositionSetpoint(Degrees.of(tx)));
        return infinite(()-> pid.getError());
    }

}
