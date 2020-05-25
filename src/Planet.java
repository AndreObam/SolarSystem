/**
 * This is a sub-class which inherits from the SolarObj Class (Parent) and is used to represent
 * the properties (distance, angle, diameter, colour and speed) of the Planet (Solar Object) in the Solar System.
 * @author Andre Obamwonyi
 */
public class Planet extends SolarObj {
    /**
     * Calls the super constructor from the parent class (SolarObj) in order to set the
     * properties (distance, angle, diameter, colour and speed) of the Planet.
     *
     * @param planetDistance refers to the distance from the sun to the Planet.
     * @param planetAngle refers to the orbital degree position of the the Planet.
     * @param planetDiameter refers to the size of the Planet.
     * @param planetColor refers to the colour of the Planet.
     * @param planetSpeed refers to the speed of the Planet's orbit (Orbital velocity).
     */
    public Planet(double planetAngle, double planetDiameter, double planetDistance, String planetColor, double planetSpeed) {
        super(planetAngle, planetDiameter, planetDistance, planetColor, planetSpeed);
    }
}