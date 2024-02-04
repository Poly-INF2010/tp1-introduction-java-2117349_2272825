package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new BaseShape();
        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        letterA.add(left);
        Rectangle top = new Rectangle(halfMaxHeight, stripeThickness);
        letterA.add(top);
        Rectangle center = new Rectangle(halfMaxHeight, stripeThickness);
        letterA.add(center);
        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        letterA.add(right);


        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();
        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        letterB.add(left);
        Ellipse ell1 = new Ellipse(halfMaxHeight, (maxWidth - stripeThickness));
        letterB.add(ell1);
        Ellipse ell2 = new Ellipse(halfMaxHeight, (maxWidth - stripeThickness));
        letterB.add(ell2);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return create_O();
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return create_O();
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        return create_O();
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return create_O();
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse forme = new Ellipse(maxWidth,maxHeight);
        Ellipse aEffacer = new Ellipse(maxWidth-stripeThickness,maxHeight-stripeThickness);
        forme.remove(aEffacer);
        return forme;
    }

}
