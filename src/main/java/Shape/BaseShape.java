package Shape;

import Interface.Transform;
import Point.Point2d;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinades
     * As Collection cannot be instanciated directly, sub-class Arraylist is instanciated
     */
    public BaseShape() {
        this.coords = new ArrayList<Point2d>();
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points. Does a deep copy
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this.coords = cloneCoords(coords);
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        if(coord != null) {
            this.coords.add(coord.clone());
        }
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        for(Point2d point : shape.coords){
            this.add(point.clone());
        }
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        for(Point2d point : coords){
            this.add(point.clone());
        }
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
         this.coords.remove(coord);
         return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        for(Point2d point : shape.coords){
            remove(point);
        }
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        for(Point2d point : coords){
            remove(point);
        }
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        this.coords.clear();
        this.coords.addAll(newCoords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        return new ArrayList<>(this.coords);
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return cloneCoords(this.coords);
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     * If empty shape, returns -1*Double.MAX_VALUE
     */
    public Double getMaxX() {
        if(!coords.isEmpty()) {
            Double maxX = this.coords.iterator().next().X();
            for (Point2d point : this.coords) {
                if (point.X() > maxX) {
                    maxX = point.X();
                }
            }
            return maxX;
        }

        return -Double.MAX_VALUE;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     * If empty shape, returns -1*Double.MAX_VALUE
     */
    public Double getMaxY() {
        if(!this.coords.isEmpty()) {
            Double maxY = this.coords.iterator().next().Y();
            for (Point2d point : this.coords) {
                if (point.Y() > maxY) {
                    maxY = point.Y();
                }
            }
            return maxY;
        }

        return -Double.MAX_VALUE;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        Double maxX = getMaxX();
        Double maxY = getMaxY();

        return new Point2d(maxX,maxY);
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     * If empty shape, returns Double.MAX_VALUE
     */
    public Double getMinX() {
        if(!this.coords.isEmpty()) {
            Double minX = this.coords.iterator().next().X();
            for (Point2d point : this.coords) {
                if (point.X() < minX) {
                    minX = point.X();
                }
            }
            return minX;
        }

        return Double.MAX_VALUE;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     * If empty shape, returns Double.MAX_VALUE
     */
    public Double getMinY() {
        if(!this.coords.isEmpty()) {
            Double minY = this.coords.iterator().next().Y();
            for (Point2d point : this.coords) {
                if (point.Y() < minY) {
                    minY = point.Y();
                }
            }
            return minY;
        }
        return Double.MAX_VALUE;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        Double minX = getMinX();
        Double minY = getMinY();

        return new Point2d(minX,minY);
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        return new BaseShape(cloneCoords());
    }

    public BaseShape rotate(Double angle){

        rotate(coords,angle);

        return this;
    }


    public BaseShape translate(Point2d translatePoint){
        translate(coords,translatePoint);
        return this;
    }
}
