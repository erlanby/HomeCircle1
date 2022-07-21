public class Circle {
    private static final double PI = 3.14159265;

    static void area(int radius){
        System.out.println(PI * (radius * radius));
    }

    static void circumference(int rad){
        System.out.println(PI * 2 * rad);
    }
}
