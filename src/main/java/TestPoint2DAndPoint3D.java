public class TestPoint2DAndPoint3D {
    public static void main(String[] args) {
        // Test Point2D
        Point2D point2D = new Point2D(1.1f, 2.2f);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(point2D.getXY());
        point2D.setX(3.3f);
        point2D.setY(4.4f);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        point2D.setXY(5.5f, 6.6f);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(point2D.getXY());
        System.out.println(point2D.toString());
        // Test Point3D
        Point3D point3D = new Point3D(7.7f, 8.8f, 9.9f);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(point3D.getXYZ());
        point3D.setX(10.10f);
        point3D.setY(11.11f);
        point3D.setZ(12.12f);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        point3D.setXYZ(13.13f, 14.14f, 15.15f);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
        System.out.println(point3D.getXYZ());
        System.out.println(point3D.toString());
    }
}
