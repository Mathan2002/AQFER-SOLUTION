import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {2,12,39,2009,243,42,21};
        int n = arr.length;
        int limit = n/2;
        if(n%2 != 2) {
            limit++;
        }
        Integer[] array = new Integer[n];
        for(int i = 0; i < n; i++) {
            array[i] = arr[i];
        }
        Arrays.sort(array, 0, n/2);
        Arrays.sort(array, limit, n, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
