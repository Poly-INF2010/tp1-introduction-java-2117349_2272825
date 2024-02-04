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
        Double angle = Math.PI/11;
        BaseShape letterA = new BaseShape();
        Rectangle leftBar = new Rectangle(stripeThickness,maxHeight);
        Rectangle rightBar = leftBar.clone();
        Rectangle centerBar = new Rectangle(halfMaxWidth, halfStripeThickness);
        centerBar.translate(new Point2d(0.0,stripeThickness));
        leftBar.translate(new Point2d(-halfMaxWidth + halfStripeThickness,0.0));
        rightBar.translate(new Point2d(halfMaxWidth - halfStripeThickness ,0.0));
        leftBar.rotate(angle);
        rightBar.rotate(-angle);
        letterA.add(leftBar);
        letterA.add(centerBar);
        letterA.add(rightBar);
        return letterA;

    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(new Point2d(-halfMaxWidth,0.0));

        Ellipse ell1 = new Ellipse((maxWidth), halfMaxHeight);
        Ellipse effaceEll1 = new Ellipse(maxWidth-stripeThickness,halfMaxHeight-stripeThickness);
        ell1.remove(effaceEll1);
        Ellipse ell2 = ell1.clone();
        ell1.translate(new Point2d(0.0,halfMaxHeight/2));
        ell2.translate(new Point2d(0.0,-halfMaxHeight/2));


        letterB.add(leftBar);
        letterB.add(ell1);
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
        Double centerLeft = -halfMaxWidth+halfStripeThickness;
        Double centerRight = -centerLeft;

        BaseShape letterH = new BaseShape();
        Rectangle leftBar = new Rectangle(stripeThickness,maxHeight);
        Rectangle rightBar = leftBar.clone();
        rightBar.translate(new Point2d(centerRight,0.0));
        leftBar.translate(new Point2d(centerLeft,0.0));
        Rectangle centerBar = new Rectangle(maxWidth,stripeThickness);
        letterH.add(leftBar);
        letterH.add(centerBar);
        letterH.add(rightBar);

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
