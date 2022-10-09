// Count Pairs
// Tom gave Jerry a problem, and you have to solve this for Jerry. The problem is as follows:
// You are given an array 'A' of length 'N'. You have to count the number of pairs (i, j), where 'i' < 'j' 
// and the sum of 'A[i]' and 'A[j]' is greater than 'K'.
// Input 1: 2
// 3 5
// 1 2 3
// 5 1
// 1 4 5 11 7
// Output 1:
// 0
// 10

import java.util.*;

public class CountPairs {
    static int countPairs(int[] arr, int n, int K) {
        int count = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(i < j && (arr[i] + arr[j]) > K) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int result = countPairs(arr, n, K);
            System.out.println(result);
        }
        sc.close();
    }
}
