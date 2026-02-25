package HN_K24_CNTT4_NguyenDoanhTuan_002;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhap so luong phan tu \n");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d \t", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang ban dau:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arr[i]);
        }

        int index;
        System.out.print("\nNhap vi tri muon xoa \n");
        index = sc.nextInt();

        if (index >= 0 && index < n) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        System.out.println("Mang sau khi xoa:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arr[i]);
        }

        int[] arrTemp = new int[n];
        for (int i = 0; i < n; i++) {
            arrTemp[i] = arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrTemp[j] > arrTemp[j + 1]) {
                    int temp = arrTemp[j];
                    arrTemp[j] = arrTemp[j + 1];
                    arrTemp[j + 1] = temp;
                }
            }
        }

        System.out.println("\nCac so con thieu trong mang:");

        boolean found = false;

        for (int missing = 1; missing < arrTemp[0]; missing++) {
            System.out.print(missing + " ");
            found = true;
        }

        for (int i = 0; i < n - 1; i++) {
            int current = arrTemp[i];
            int next = arrTemp[i + 1];

            if (next - current > 1) {
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.print(missing + " ");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Khong co so nao thieu!");
        }
    }
}