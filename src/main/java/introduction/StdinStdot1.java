package introduction;

import java.util.*;

public class StdinStdot1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
