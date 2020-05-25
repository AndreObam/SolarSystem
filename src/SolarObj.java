/**
 * This is a sub-class which inherits from the Point Class (Parent) and is used to represent the different
 * properties of the Solar Objects (Planet, Moon or Sun) in the Solar System.
 * @author Andre Obamwonyi
 */
public class SolarObj extends Point {
    /**
     * Calls the super constructor from the parent class (Point) in order to set the
     * properties (distance, angle, diameter, colour and speed) of the Solar Object (Planet, Moon or Sun).
     *
     * @param distance refers to the distance from the sun to the Solar Object.
     * @param angle refers to the orbital degree position of the the Solar Object.
     * @param diameter refers to the size of the Solar Object.
     * @param color refers to the colour of the Solar Object.
     * @param speed refers to the speed of the Solar Object's orbit (Orbital velocity).
     */
    public SolarObj(double angle, double diameter, double distance, String color, double speed){
        super(angle, diameter, distance, color, speed);
    }
}
