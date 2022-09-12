package Variable;
import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pencil + pen + eraser);
        System.out.println("Bill total is " + total);
        // add 18%gst
        float newTotal = total + (0.18f * total);
        System.out.println(newTotal);
    }
}
