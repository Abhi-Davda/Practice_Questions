
// WAP to delete an element from array specified by user. 
// if element is not found print a message “Element is not found” (do not take a new array).
import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements to Add:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("---Enter Elemnets---");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to Delete:");
        int d = sc.nextInt();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                j = i;
                break;
            }
            else{
                System.out.println("NO element Found");
            }
        }
        for (int i = j; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        System.out.println("********");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Element-->" + a[i]);
        }

        // or we can simply continue the element to delete and print the other elemnets.
        sc.close();
    }
}
