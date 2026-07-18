//CEILING OF NUMBER: ceiling element is the smallest element greater than or equal to target
/*import java.util.Scanner;

public class ceilingElement{
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21};
        int target  = 6;
        int ans = ceElement(arr,target);
        System.out.println(+ ans);
        }
        static int ceElement(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1;

            while(start<=end){
                int mid = start + (end - start)/2;

                if(target == arr[mid]){
                    return mid;
                }
                if(target < arr[mid]){
                    end  = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return arr[start];
        }
}*/

// PROGRAM TO FIND THE FLOOR OF THE NUMBER: biggest number smaller than or equal to target number
/*import java.util.Scanner;

public class ceilingElement{
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25};
        int target = 18;
        int ans = floorNumber(arr,target);
        System.out.println(+ ans);
    }

    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[end];
    }
}*/

/*public class ceilingElement{
    public static void main(String[] args){
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int ans = firstLast(arr,target);
        System.out.println(+ ans);
    }

    static int firstLast(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                end = mid - 1;
                while(start <= end){
               mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
                System.out.println(+ end);
            }else{
                start = mid + 1;
                System.out.println(+ start);
            }
                //return mid;
            }


            if(target < arr[mid]){
                end = mid - 1;
                System.out.println(+ end);
            }else{
                start = mid + 1;
                System.out.println(+ start);
            }
        }
        return -1;
    }
}*/

class ceilingElement{
    public static void main(String[] args){
        int[] arr = {0,1,2,3,1,0};
        int ans = peakIndex(arr);
        System.out.println(peakIndex(+ ans));
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        return start;
    }
}