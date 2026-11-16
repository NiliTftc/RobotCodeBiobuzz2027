package org.firstinspires.ftc.teamcode.TeleopStaff;

import static org.firstinspires.ftc.teamcode.Robot.NextRobot.INTAKE_MECHANISM;

import androidx.annotation.NonNull;

import dev.nextftc.robot.NextRobot;
import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.drive.DriveCommands;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;
import dev.nextftc.robot.opmode.OpModeHook;
import dev.nextftc.robot.triggers.CommandGamepad;

@NextTeleop(name = "My Teleop")
public class TeleopCode extends NextOpMode {

    public TeleopCode(@NonNull NextRobot robot, @NonNull OpModeHook... hooks) {
        super(robot, hooks);
    }



    CommandGamepad gp1 = new CommandGamepad(gamepad1);

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }

    @Override
    public void start() {
        gp1.circle().onTrue(INTAKE_MECHANISM.FlowerIntake(0, 1));
        gp1.x().onTrue(INTAKE_MECHANISM.FullStop(0));
    }



}

