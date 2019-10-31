package point.org;

public class Main {

    public static void main(String[] args) {
	    Point point = new Point();
        System.out.println(point);

        point = new Point(1.0f,1.0f);
        System.out.println(point);

        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);

        moveAblePoint = new MoveAblePoint(3.0f,4.0f);
        System.out.println(moveAblePoint);

        moveAblePoint = new MoveAblePoint(2.0f, 2.0f, 4.0f,4.0f);
        System.out.println(moveAblePoint);

    }
}
