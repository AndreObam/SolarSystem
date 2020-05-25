import java.util.Random;
/**
 * The Driver class is the class which contains the main, this is ran in order to test the project's functionality.
 * @see SolarSystem
 * @see Point
 * @author Andre Obamwonyi
 */
public class Driver {
    public static void main(String[] Args){
        SolarSystem solarSys = new SolarSystem(900,900);

        /*Solar System Components: Sun and Planets*/
        Sun theSun = new Sun(0,50,0,"YELLOW",10);
        Planet mercury = new Planet(0,25,70,"DARKGREY", 10);
        Planet venus = new Planet(0,25,140,"ORANGE", 15);
        Planet earth = new Planet(0,25,210,"BLUE", 5);
        Planet mars = new Planet(0,25,280,"RED", 20);
        Planet jupiter = new Planet(0,25,350,"LIGHTGREY", 5);

        /*Random Number Generated used for random placement of asteroids in the asteroid belt*/
        Random rand = new Random();                       //creation of an instance of the Random class
        int randomNumber = rand.nextInt(20) + 5;    //used to set the upper and lower bounds on generated number.

        /*Solar System Components: Creation of Asteroid Belt (Array of Moons)*/
        Moon asteroid[] = new Moon[74];
        for(int i = 0; i < 74; i++){
            asteroid[i] = new Moon((i*randomNumber),5,(mars.getDistance() + jupiter.getDistance())/2,"WHITE",10);
        }

        /*Creation of Solar Object Array used to hold all components in the solar system*/
        SolarObj solarObjects[] = new SolarObj[80];
        solarObjects[0] = theSun;
        solarObjects[1] = mercury;
        solarObjects[2] = venus;
        solarObjects[3] = earth;
        solarObjects[4] = mars;
        solarObjects[5] = jupiter;

        /*Adds each of the asteroids to the SolarObj Array*/
        int j = 0;
        for(int i = 6; i < solarObjects.length; i++){
            solarObjects[i] = asteroid[j];
            j++;
        }

        /*This loop is used in order to move the Solar Objects in the solarSystem*/
        while(true) {
            for(int i = 0; i < solarObjects.length; i++){
                solarObjects[i].updatePosition(solarSys);   //Each SolarObject in the array is constantly re-drawn at a new position.
            }
            solarSys.finishedDrawing();                     // Makes all objects drawn recently drawn to be made visible on the screen.
        }
    }
}
