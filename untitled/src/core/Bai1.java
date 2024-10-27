package core;

import java.util.Scanner;

public class Bai1 {
    public int findK(int[] Arr, int k){
        int l = 0, r = Arr.length - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (Arr[mid] == k) {
                return mid;
            }
            if (Arr[mid] < k) {
                l = mid + 1;
            } else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Bai1 obj = new Bai1();
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[nums];
        for (int i = 0; i < nums; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(obj.findK(arr, k));
    }
}
