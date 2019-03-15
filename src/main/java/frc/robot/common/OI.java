import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {
    // ALL User Inputs go in this class

    private static int DRIVER_PORT = 0; // Controller Port used for Driver Controller
    private XboxController driverControl; // Driver Controller Object

    public OI(){
        this.driverControl = new XboxController(DRIVER_PORT);
        System.out.print("Driver Controller Set to Port " + DRIVER_PORT);
    }

    /* Getters */

    // X & Y Joystick Values
    public double getLeftY(){
        return driverControl.getY(Hand.kLeft);
    }
    public double getRightY(){
        return driverControl.getY(Hand.kRight);
    }
    public double getLetX(){
        return driverControl.getX(Hand.kLeft);
    }
    public double getRightX(){
        return driverControl.getX(Hand.kRight);
    }
    // Buttons
    public boolean getXButton(){
        return driverControl.getXButton();
    }
}