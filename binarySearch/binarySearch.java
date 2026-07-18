/*public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,21,23,25,27,28,29,30,31};
        int target = 30;

        int ans = biSearch(arr, target);
        System.out.println(ans);
    }

    static int biSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}*/

/*public class binarySearch{
    public static void main(String[] args){
        int[] arr = {13,12,11,10,9,8,7,6,5,4,3,2,1};
        int target = 12;
        int ans = bSearch(arr,target);
        System.out.println("the value found at: " + ans);
    }

    static int bSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid  = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}*/
/*public class binarySearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 12;
        int ans = bSearch(arr,target);
        System.out.println(ans);
    }

    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}*/
//[-1,0,3,5,9,12]
class Solution {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int target = 1;
        int ans = binarySearch(arr,target);
        System.out.println(+ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;

            if(target == arr[mid] && arr[mid] != arr[mid + 1]){
                return arr[mid + 1];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }
            
        }
        return -1;
    }
}

