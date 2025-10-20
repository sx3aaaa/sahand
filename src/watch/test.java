package watch;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        watch T1 = new watch();
        watch T2 = new watch(12, 3);
        watch T3 = new watch(12, 10, 2);
        watch T4 = new watch(12);

        System.out.println("The times:");
        T1.display();
        T2.display();
        T3.display();
        T4.display();

        System.out.println("\nDo you want to update the time for the second clock (T2)? yes/no");
        String ans = scan.next();

        if (ans.equals("yes")) {
            System.out.println("Enter the new time (hour minute second):");
            int hour = scan.nextInt();
            int minute = scan.nextInt();
            int second = scan.nextInt();

            
            T2.setHour(hour);
            T2.setMinute(minute);
            T2.setSecond(second);

            System.out.println("The updated time for T2 is:");
            T2.display();
        } else {
            System.out.println("No changes made.");
        }

    }
}