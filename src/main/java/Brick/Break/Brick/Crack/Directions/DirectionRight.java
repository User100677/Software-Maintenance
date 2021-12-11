package Brick.Break.Brick.Crack.Directions;

import java.awt.*;

/**
 * This class produce the start location and end location of right direction crack.
 */
public class DirectionRight implements Direction {
    private Point start = new Point();
    private Point end = new Point();

    /**
     * This method set the start location of the crack.
     * @param start This parameter is the start location of the crack.
     * @param bounds This parameter is the boundary of the bricks.
     * @return
     */
    @Override
    public Point setStartLocation(Point start, Rectangle bounds){
        start.setLocation(bounds.getLocation());
       return start;



    }

    /**
     * This method set the start location of the crack.
     * @param end This parameter is the end location of the crack.
     * @param bounds This parameter is the boundary of the bricks.
     * @return
     */
    @Override
    public Point setEndLocation(Point end, Rectangle bounds){
        end.setLocation(bounds.x, bounds.y + bounds.height);
       return end;

    }


}
