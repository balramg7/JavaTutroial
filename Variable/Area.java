package Variable;
import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
    }
}
