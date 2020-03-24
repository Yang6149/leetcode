package nowcode320;

import java.util.Arrays;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] students = new int[num][2];
        for (int i = 0; i < num; i++) {
            students[i][0]=sc.nextInt();
            students[i][1]=sc.nextInt();
        }
        Arrays.sort(students,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);

        for (int[] student : students) {
            System.out.println(student[0]+" "+student[1]);
        }

    }
}
