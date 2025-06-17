// WAP to calculate an angle between hour and minute hand. 
// (Hours and minutes should be taken from user).

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour in 1-12:");
        int h = sc.nextInt();
        System.out.println("Enter Min in 0-59:");
        int m = sc.nextInt();

        double h_angle = (30 * h) + (0.5 * m);
        double m_angle = 6 * m;

        double angle = Math.abs(h_angle - m_angle);

        angle = Math.min(angle, 360 - angle);
        System.out.println("Angle = " + angle);
        sc.close();

    }
}
