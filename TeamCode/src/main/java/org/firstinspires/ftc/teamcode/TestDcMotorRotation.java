package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class TestDcMotorRotation extends OpMode {

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

        leftFrontDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBackDrive.setDirection(DcMotorSimple.Direction.REVERSE);


    }
    @Override
    public void loop()
    {
        leftFrontDrive.setPower(-gamepad1.left_stick_y);
        rightFrontDrive.setPower(gamepad1.left_stick_x);
        leftBackDrive.setPower(gamepad1.left_trigger);
        rightBackDrive.setPower(gamepad1.right_trigger);
    }
}
