package HN_K24_CNTT4_NguyenDoanhTuan_002;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Nhap so phan tu mang A: ");
        n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.print("Nhap so phan tu mang B: ");
        m = sc.nextInt();
        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Nhap B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        System.out.println("Giao cua 2 mang:");

        for (int i = 0; i < n; i++) {
            boolean inB = false;

            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    inB = true;
                    break;
                }
            }

            if (inB) {
                boolean daIn = false;

                for (int k = 0; k < i; k++) {
                    if (A[k] == A[i]) {
                        daIn = true;
                        break;
                    }
                }

                if (!daIn) {
                    System.out.print(A[i] + " ");
                }
            }
        }
    }
}