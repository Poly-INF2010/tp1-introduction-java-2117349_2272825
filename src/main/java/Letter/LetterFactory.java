package Letter;

import Interface.Transform;
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
        /*BaseShape letterA = new BaseShape();
        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        letterA.add(left);
        Rectangle top = new Rectangle(stripeThickness, halfMaxHeight);
        top.replaceAll(top.rotate(top.getCoords(), 1.5707963268));
        letterA.add(top);
        Rectangle center = new Rectangle(stripeThickness, halfMaxHeight);
        center.replaceAll(center.rotate(center.getCoords(), 1.5707963268));
        letterA.add(center);
        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        letterA.add(right);*/
        Rectangle letterA = new Rectangle(maxWidth, maxHeight);
        Square aEffacer1 = new Square((maxWidth - 2*stripeThickness));
        for(Point2d pt : aEffacer1.getCoords()){
            pt.add(halfStripeThickness);
        }
        letterA.remove(aEffacer1);
        Square aEffacer2 = new Square((maxWidth - 2*stripeThickness));
        for(Point2d pt : aEffacer2.getCoords()){
            pt.add(halfStripeThickness);
            pt.multiply(-1.0);
        }
        letterA.remove(aEffacer2);
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
        Ellipse ell1 = new Ellipse((maxWidth - stripeThickness), halfMaxHeight);
        ell1.replaceAll(ell1.rotate(ell1.getCoords(), 1.5707963268));
        letterB.add(ell1);
        Ellipse ell2 = new Ellipse((maxWidth - stripeThickness), halfMaxHeight);
        ell2.replaceAll(ell2.rotate(ell2.getCoords(), 1.5707963268));
        letterB.add(ell2);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Double centerRight = halfMaxWidth-halfStripeThickness;

        BaseShape lettreC = create_O();
        Rectangle aEffacer = new Rectangle(stripeThickness,halfMaxHeight);
        aEffacer.translate(new Point2d(centerRight,0.0));
        lettreC.remove(aEffacer);
        return lettreC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Double centerLeft = -halfMaxWidth+halfStripeThickness;
        Double centerTop = halfMaxHeight-halfStripeThickness;
        Double centerBottom = -centerTop;

        BaseShape lettreE = new BaseShape();
        Rectangle leftBar = new Rectangle(stripeThickness,maxHeight);
        leftBar.translate(new Point2d(centerLeft,0.0));
        Rectangle centerBar = new Rectangle(maxWidth,stripeThickness);
        Rectangle topBar = centerBar.clone();
        topBar.translate(new Point2d(0.0,centerTop));
        Rectangle bottomBar = centerBar.clone();
        bottomBar.translate(new Point2d(0.0,centerBottom));
        lettreE.add(leftBar);
        lettreE.add(centerBar);
        lettreE.add(topBar);
        lettreE.add(bottomBar);

        return lettreE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle letterH = new Rectangle(maxWidth, maxHeight);
        Rectangle aEffacer1 = new Rectangle((maxWidth - 2*stripeThickness), (maxHeight - halfStripeThickness));
        for(Point2d pt : aEffacer1.getCoords()){
            pt.add(halfStripeThickness);
        }
        letterH.remove(aEffacer1);
        Rectangle aEffacer2 = new Rectangle((maxWidth - 2*stripeThickness), (maxHeight - halfStripeThickness));
        for(Point2d pt : aEffacer1.getCoords()){
            pt.add(halfStripeThickness);
            pt.multiply(-1.0);
        }
        letterH.remove(aEffacer2);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Double angle = -Math.PI/8;
        BaseShape lettreN = new BaseShape();
        Rectangle leftBar = new Rectangle(stripeThickness,maxHeight);
        Rectangle rightBar = leftBar.clone();
        Rectangle centerBar = leftBar.clone();
        leftBar.translate(new Point2d(-halfMaxWidth,0.0));
        rightBar.translate(new Point2d(halfMaxWidth,0.0));
        centerBar.rotate(angle);
        lettreN.add(leftBar);
        lettreN.add(centerBar);
        lettreN.add(rightBar);


        return lettreN;
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
