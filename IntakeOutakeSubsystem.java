/*
 * Anzar 2/16/24 stinky stinky code, just like all java code
 */

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeOutakeSubsystem extends SubsystemBase {
    public static CANSparkMax IntakeMotor;
    public static CANSparkMax OutakeMotor;
    public static CANSparkMax WristMotor;

    public IntakeOutakeSubsystem() {
        IntakeMotor = new CANSparkMax(Constants.DriveConstants.intakeSpark, MotorType.kBrushless);
        OutakeMotor = new CANSparkMax(Constants.DriveConstants.outakeSpark, MotorType.kBrushless);
        WristMotor = new CANSparkMax(Constants.DriveConstants.wristSpark, MotorType.kBrushless);
    }

    public void setIntake(double v) {
        IntakeMotor.setVoltage(v);
    }

    public void setOutake(double v) {
        OutakeMotor.setVoltage(v);
    }

    public void setWrist(double v) {
        WristMotor.setVoltage(v);
    }
}
