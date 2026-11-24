//package org.firstinspires.ftc.teamcode.Teleop;
//
////import static org.firstinspires.ftc.teamcode.RobotData.Robot.NextRobot.INTAKE_MECHANISM;
//
////import static org.firstinspires.ftc.teamcode.RobotData.Robot.NextRobot.INTAKE_MECHANISM;
//import static com.pedropathing.ivy.commands.Commands.instant;
//import static org.firstinspires.ftc.teamcode.Data.StarRobot.*;
//import androidx.annotation.NonNull;
//
//
//import org.firstinspires.ftc.teamcode.Data.StarRobot;
//import org.firstinspires.ftc.teamcode.Mechanisms.IntakeMechanism;
//
//import dev.nextftc.robot.NextRobot;
//import dev.nextftc.robot.Telemetry;
//import dev.nextftc.robot.opmode.NextOpMode;
//import dev.nextftc.robot.opmode.NextTeleop;
//import dev.nextftc.robot.opmode.OpModeHook;
//import dev.nextftc.robot.triggers.CommandGamepad;
//
//@NextTeleop(name = "TeleopCode")
//public class TeleopCode extends NextOpMode {
//
//    public TeleopCode(@NonNull NextRobot robot, @NonNull OpModeHook... hooks) {
//        super(robot, hooks);
//    }
//
//    CommandGamepad gp1 = new CommandGamepad(gamepad1);
//
//    @Override
//    public void periodic() {
//        Telemetry.log("Status", "Running");
//    }
//
//    @Override
//    public void start() {
//        gp1.circle().onTrue(StarRobot.getIntakeMechanism.FlowerIntake(1, 1));
//        gp1.x().onTrue(StarRobot.getIntakeMechanism.FullStop(0));
//    }
//
//
//
//}
//
