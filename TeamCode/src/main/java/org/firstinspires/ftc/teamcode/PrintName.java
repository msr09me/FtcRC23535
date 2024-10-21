package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous
public class PrintName extends OpMode {

    @Override
    public void init()
    {
        telemetry.addData("School: ", "E.O. Smith");
    }
    @Override
    public void loop()
    {
        telemetry.addData("School: ", "Windham Tech");
    }
}
