/**
 * This is a sub-class which inherits from the SolarObj Class (Parent) and is used to represent
 * the properties (distance, angle, diameter, colour and speed) of the Moon (Solar Object) in the Solar System.
 * @author Andre Obamwonyi
 */
public class Moon extends SolarObj {
    /**
     * Calls the super constructor from the parent class (SolarObj) in order to set the
     * properties (distance, angle, diameter, colour and speed) of the Moon.
     *
     * @param moonDistance refers to the distance from the sun to the Moon.
     * @param moonAngle refers to the orbital degree position of the the Moon.
     * @param moonDiameter refers to the size of the Moon.
     * @param moonColor refers to the colour of the Moon.
     * @param moonSpeed refers to the speed of the Moon's orbit (Orbital velocity).
     */
    public Moon (double moonAngle, double moonDiameter, double moonDistance, String moonColor, double moonSpeed) {
        super(moonAngle, moonDiameter, moonDistance, moonColor, moonSpeed);
    }
}


