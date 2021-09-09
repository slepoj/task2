package train.com.vote;

public class Vote {

    public static void main(String[] args) {
        int[] arr = strToInt(args);
        System.out.println("Max number of vote have " + election(arr));
    }

    public static int election(int[] arr) {
        int maxv = 0;
        int v = 0, v2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    v2++;
                }
            }
            if (v<=v2){
                maxv = arr[i];
                v = v2;
            }
            v2 = 0;
        }
        return maxv;
    }

    private static int[] strToInt (String[] args){
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        return arr;
    }
}
