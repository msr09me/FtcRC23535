package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class testDrive extends OpMode {

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

        leftFrontDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBackDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        rightBackDrive.setDirection(DcMotorSimple.Direction.FORWARD);

    }
    @Override
    public void loop()
    {
        double leftFrontPower = 0.0;
        double leftBackPower = 0.0;
        double rightFrontPower = 0.0;
        double rightBackPower = 0.0;

        double forward = -gamepad1.left_stick_y;
        double right = gamepad1.left_stick_x;
        double rotate = gamepad1.right_stick_x;

        leftFrontPower = forward + right + rotate;
        leftBackPower = forward - right + rotate;
        rightFrontPower = forward - right - rotate;
        rightBackPower = forward + right - rotate;

        double maxPower = 0.0;

        maxPower = Math.max(Math.abs(leftFrontPower), Math.abs(leftBackPower));

        maxPower = Math.max(maxPower, Math.abs(rightFrontPower));

        maxPower = Math.max(maxPower, Math.abs(rightBackPower));

        leftFrontPower = leftFrontPower / maxPower;
        leftBackPower = leftBackPower / maxPower;
        rightFrontPower = rightFrontPower / maxPower;
        rightBackPower = rightBackPower / maxPower;

        leftFrontDrive.setPower(leftFrontPower);
        rightFrontDrive.setPower(rightFrontPower);
        leftBackDrive.setPower(leftBackPower);
        rightBackDrive.setPower(rightBackPower);

    }
}
