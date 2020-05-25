/**
 * This class is used to provide detail regarding the properties of the Solar Objects in the solar system
 * and implements movement functionality of the objects in the Solar System using the provided information.
 * @author Andre Obamwonyi
 */
public class Point {
    private double angle;
    private double diameter;
    private double distance;
    private String color;
    private double speed;

    /**
     * Constructor is used to to set the properties (distance, angle, diameter, colour and speed) of
     * the Solar Object in the Solar System.
     *
     * @param distance refers to the distance from the sun to the Solar Object.
     * @param angle refers to the orbital degree position of the the Solar Object.
     * @param diameter refers to the size of the Solar Object.
     * @param color refers to the colour of the Solar Object.
     * @param speed refers to the speed of the Solar Object's orbit (Orbital velocity).
     */
    public Point(double angle, double diameter, double distance, String color, double speed){
        this.angle = angle;
        this.diameter = diameter;
        this.distance = distance;
        this.color = color;
        this.speed = speed;
    }

    /**
     * This method when called returns the angle of the Solar Object.
     * @return angle
     */
    public double getAngle(){
        return angle;
    }

    /**
     * This method when called returns the diameter of the Solar Object.
     * @return diameter
     */
    public double getDiameter(){
        return diameter;
    }

    /**
     * This method when called returns the distance of the Solar Object.
     * @return distance
     */
    public double getDistance(){
        return distance;
    }

    /**
     * This method when called returns the color of the Solar Object.
     * @return color
     */
    public String getColor(){
        return color;
    }

    /**
     * This method when called returns the speed of the Solar Object.
     * @return speed
     */
    public double getSpeed(){
        return speed;
    }

    /**
     * This method when called is used to set the angle (orbital degrees) of the Solar Object.
     * @param a refers to the angle of the Solar Object.
     */
    public void setAngle(double a){
        angle = a;
    }

    /**
     * This method is used in order to implement movement functionality for the objects in the Solar System. This enables the
     * objects in the Solar System to orbit by constantly re-drawing of the Solar Object with an incremented angle value.
     *
     * @param solarSys refers to SolarSystem instance in which the object will be drawn in.
     */
    public void updatePosition(SolarSystem solarSys) {
        solarSys.drawSolarObject(getDistance(),getAngle(), getDiameter(),getColor());
        setAngle(getAngle() + (getSpeed()/5));
    }
}


