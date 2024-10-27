package core;

import java.util.Scanner;

public class Bai2 {
    public int Subsequent(int[] Arr, int k){
        int  ans = -1, pre = 0, sum = 0 , num = 0;
       for(int i = 0 ; i < Arr.length ; i++){
           num = ((i >= k) ? Math.min(num, sum += Arr[i-k]) : 0);
           ans = ((i >= k) ? Math.max(ans, (pre += Arr[i]) - num) : (pre += Arr[i]));
       }
        return ans;
    }

    public static void main(String[] args) {
        Bai2 b = new Bai2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(b.Subsequent(arr, k));
    }
}
