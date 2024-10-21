package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DcMotor1Test extends OpMode {

    private DcMotor leftFrontDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightBackDrive = null;

    @Override
    public void init()
    {

        // Hardware mapping (to store the actual DC motors information to the objects

        leftFrontDrive = hardwareMap.get(DcMotor.class,"leftFront");
        rightFrontDrive = hardwareMap.get(DcMotor.class,"rightFront");
        leftBackDrive = hardwareMap.get(DcMotor.class,"leftBack");
        rightBackDrive = hardwareMap.get(DcMotor.class,"rightBack");

        // Set the direction of rotation of the DC motors


    }
    @Override
    public void loop()
    {
        leftFrontDrive.setPower(0.1);
        rightFrontDrive.setPower(0.1);
        leftBackDrive.setPower(0.1);
        rightBackDrive.setPower(0.1);
    }
}
