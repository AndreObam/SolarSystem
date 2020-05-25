/**
 * This is a sub-class which inherits from the SolarObj Class (Parent) and is used to represent
 * the properties (distance, angle, diameter, colour and speed) of the Sun (Solar Object) in the Solar System.
 * @author Andre Obamwonyi
 */
public class Sun extends SolarObj {
    /**
     * Calls the super constructor from the parent class (SolarObj) in order to set the
     * properties (distance, angle, diameter, colour and speed) of the Sun.
     *
     * @param sunDistance refers to the distance from the sun to the Sun (centred value of 0).
     * @param sunAngle refers to the orbital degree position of the the Sun.
     * @param sunDiameter refers to the size of the Sun
     * @param sunColor refers to the colour of the Sun.
     * @param sunSpeed refers to the speed of the Sun's orbit (Orbital velocity).
     */
    public Sun(double sunAngle, double sunDiameter, double sunDistance, String sunColor, double sunSpeed) {
        super(sunAngle,sunDiameter,sunDistance,sunColor,sunSpeed);
    }
}
