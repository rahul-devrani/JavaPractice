import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));

        // int[] ans = reverse(arr);
        // System.out.println(Arrays.toString(ans));

        int[] answer = reverseNew(arr);

        System.out.println(Arrays.toString(answer));

        
    }

    // public static int[] reverse(int arr[]) {
    //     int i=0;
    //     int j=arr.length-1;
    //     while(i<=j){
    //         swap(arr, i, j);
    //         i++;
    //         j--;
    //  }
    //  return arr;
     

        
    // }    


    public static int[] reverseNew(int arr[]) {
        int a=arr.length;
        int[] newArr = new int[a];
        int j=0;
        for(int i=a-1;i>=0;i--){
            
            newArr[j++]=arr[i];


        }
     return newArr;

        }

        
    }



