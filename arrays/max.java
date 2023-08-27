import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        int arr[] = { -2, -30, -231, -20 };

        ArrayList<Integer> results = maxMin(arr);

        System.out.println("Min Value --> " + results.get(0) + "\n " + "Max Value --> " + results.get(1));
    }

    public static int getMax(int arr[]) {
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];

            }
        }

        return maxvalue;

    }

    public static int getMin(int arr[]) {
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];

            }
        }

        return minvalue;

    }

    public static ArrayList<Integer> maxMin(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        int maxvalue = Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
        }

        result.add(minvalue);
        result.add(maxvalue);
        return result;

    }

}
