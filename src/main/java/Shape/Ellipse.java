package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * The formula used is ((x^2)/a^2) + ((y^2)/b^2) = 1 where a is the halfWidth and b is the halfHeight.
     * Y is isolated to calculate coordinates.
     * Makes multiple ellipses of the same width with different smaller heights to fill it
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double halfWidth = widthDiameter/2.0;
        Double halfHeight = heightDiameter/2.0;

        for (Double maxCoordY = halfHeight; maxCoordY > 0; maxCoordY -= 0.5){
            for(Double coordX = halfWidth; coordX > -halfWidth; coordX -= 0.5 ){
                Double coordY = maxCoordY*maxCoordY*(1 - coordX*coordX/(halfWidth*halfWidth));
                add(new Point2d(coordX, coordY));
                add(new Point2d(coordX, -coordY));
            }
        }



    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {

        this(dimensions.X(),dimensions.Y());

    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * Private constructor for clone method; assumes the coords form a filled ellipse
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(getCoords());
    }
}
