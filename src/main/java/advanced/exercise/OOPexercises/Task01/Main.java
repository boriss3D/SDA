package advanced.exercise.OOPexercises.Task01;

public class Main {
    public static void main(String[] args) {

        Point2D point2D_2 = new Point2D(1, 2);
        System.out.println(point2D_2);

        Point2D point2D_1 = new Point2D();
        point2D_1.setXY(555.0F, 333.0F);

        for (float f : point2D_1.getXY()) {
            System.out.println(f);
        }

        Point3D point3D = new Point3D(3.0F, 4.0F, 5.0F);
        System.out.println(point3D);

        point3D.setXYZ(6.0F, 7.0F, 8.0F);
        for (float f : point3D.getXYZ()) {
            System.out.println(f);
        }
    }
}
