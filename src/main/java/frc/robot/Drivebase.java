package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Drivebase {
    private final WPI_TalonFX one, two;

    public Drivebase() {
        one = new WPI_TalonFX(1);
        two = new WPI_TalonFX(2);
    }

    public void run(double speedOne, double speedTwo) {
        one.set(speedOne);
        two.set(speedTwo);
    }
}