package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * The formula used is ((x^2)/a^2) + ((y^2)/b^2) <= 1 where a is the halfWidth and b is the halfHeight.
     *
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double halfWidth = widthDiameter/2.0;
        Double halfHeight = heightDiameter/2.0;

        for (Double coordY = -halfHeight; coordY < halfHeight; coordY += 0.5){
            for(Double coordX = -halfWidth; coordX < halfWidth; coordX += 0.5 ){

                if((((coordX*coordX)/(halfWidth*halfWidth)) + ((coordY*coordY)/(halfHeight*halfHeight))) <= 1){
                    add(new Point2d(coordX,coordY));
                }
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
