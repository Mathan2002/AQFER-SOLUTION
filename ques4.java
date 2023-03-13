class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {1,2,3,7,5};
        int s = 12;
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            int t = 0;
            start = i;
            for(int j = i; j < arr.length; j++) {
                t += arr[j];
                if(t == s) {
                    end = j;
                    break;
                }
            }
            if(t == s) {
                break;
            }
        }
        for(int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
