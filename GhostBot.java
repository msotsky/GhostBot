import becker.robots.*;

public class GhostBot extends Robot
{
    private boolean isVisible;

    // constructor
    public GhostBot(City city, int street, int ave, Direction dir, boolean initialVisibility)
    {
        super(city, street, ave, dir);
        isVisible = initialVisibility;
    }

    // new method for a GhostBot
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    // modified (overridden) move() method that makes the GhostBot
    // print a message and then move forward twice
    public void move()
    {
        System.out.println("I'm about to move twice");
        super.move();
        super.move();
    }

    // the main method
    public static void main(String[] args)
    {
        City madrid = new City();
        GhostBot casper = new GhostBot(madrid, 5, 3, Direction.NORTH, true);
        casper.turnRight();
        casper.move();
    }
}
