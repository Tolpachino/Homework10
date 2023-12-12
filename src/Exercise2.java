public class Exercise2 {
    public final static double PI = 3.14;
    public double area(double radius){
        double area = PI * radius * radius;
        return area;
    }
    public static double length(double radius2){
        double length = PI * 2 * radius2;
        return length;
    }
    public void inf(double radius3){
        System.out.println(radius3);
        System.out.println(area(radius3));
        System.out.println(length(radius3));
    }
}
class Exercise2Test{
    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        e.area(5);
        Exercise2.length(80);
        e.inf(45);
    }
}
