package org.firstinspires.ftc.teamcode.Teleop;

//import static org.firstinspires.ftc.teamcode.RobotData.Robot.NextRobot.INTAKE_MECHANISM;

//import static org.firstinspires.ftc.teamcode.RobotData.Robot.NextRobot.INTAKE_MECHANISM;
import static com.pedropathing.ivy.commands.Commands.instant;
import static org.firstinspires.ftc.teamcode.Data.StarRobot.*;
import androidx.annotation.NonNull;


import com.pedropathing.ivy.Command;

import org.firstinspires.ftc.teamcode.Data.StarRobot;
//import org.firstinspires.ftc.teamcode.Mechanisms.IntakeMechanism;

import dev.nextftc.robot.NextRobot;
import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.drive.DriveCommands;
import dev.nextftc.robot.opmode.BulkReadHook;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;
import dev.nextftc.robot.opmode.OpModeHook;
import dev.nextftc.robot.triggers.CommandGamepad;
import dev.nextftc.robot.triggers.Trigger;

@NextTeleop(name = "TeleopCode")
public class TeleopCode extends NextOpMode {

    boolean hasMatchStarted = false;
    private StarRobot starRobot;
    public TeleopCode(StarRobot starRobot) {
        super(starRobot, BulkReadHook.INSTANCE);
        this.starRobot = starRobot;
    }

    @Override
    public void start() {
        hasMatchStarted = true;
//        starRobot.init().schedule();

        CommandGamepad gp1 = new CommandGamepad(gamepad1);
        starRobot.startDrive(gamepad1);


    }

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }

//    @Override
//    public void start() {
//        gp1.circle().onTrue(StarRobot.getIntakeMechanism.FlowerIntake(1, 1));
//        gp1.x().onTrue(StarRobot.getIntakeMechanism.FullStop(0));
//    }



}

