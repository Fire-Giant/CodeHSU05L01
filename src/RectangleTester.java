public class RectangleTester {
    public static void main(String[] args) {
        //test your rectangle here
        Rectangle rect1 = new Rectangle(5,10);
        System.out.println(rect1);
        rect1.setWidth(4);
        rect1.setHeight(15);
        System.out.println(rect1);
        rect1.resetRectangle();
        System.out.println(rect1);

    }
}
