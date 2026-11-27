package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.IMU;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.hardware.sensors.NextIMU;
import dev.nextftc.robot.Mechanism;

public class Drivetrain implements Mechanism {
    NextIMU imu = new NextIMU("imu");

    public Drivetrain() { //forward in constants -> reverse here
        backRight.setDirection(NextMotor.Direction.REVERSE);
        frontRight.setDirection(NextMotor.Direction.REVERSE);

        imu.initialize(new IMU.Parameters(new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.FORWARD)));
    }
    public NextMotor backLeft = new NextMotor("3E");
    public NextMotor frontLeft = new NextMotor("2E");
    public NextMotor backRight =  new NextMotor("1E");
    public NextMotor frontRight = new NextMotor("0E");

}