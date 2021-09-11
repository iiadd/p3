public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(0, 0, 5, 5, 10, 10);

        System.out.println(r1);

        r1.moveDown();
        System.out.println(r1);
    }
}
