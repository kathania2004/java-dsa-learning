/*import java.util.Arrays;
public class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,9};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr,int target){
        int[] ans  = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans; 
    }

    static int search(int[] arr,int target,boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(firstStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}*/

/*import java.util.Arrays;

public class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,8,9};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        //ans[1] = search(arr,target,false);
        return ans;
    }

    static int search(int[] arr,int target,boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(firstStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}*/
/*import java.util.Arrays;

public class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {5,7,7,7,7,8,8,8,9,9};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans;
    }
    static int search(int[] arr,int target,boolean firstStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end  = mid -1;
            }else if(target > arr[mid]){
                start  =  mid + 1;
            }else{
                ans  =  mid;
                if(firstStartIndex){
                    end  = mid - 1;
                }else{
                    start  =  mid + 1;
                }
            }
        }
        return ans;
    }
}*/

//Position of an Element in Infinite Sorted Array

/*import java.util.Arrays;

public class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,10,12,14,16,18,19,21,22,23,24,25,65,68,70};
        int target = 23;
        System.out.println(Arrays.toString(arr));
        int an = ans(arr,target);
        System.out.println(+ an);
    }
    //Function to pass array and store ans
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end + 1;
            //double the box
            //new end = previous end + sizeofbox*2
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    //function for binary search
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}*/
//Mountain of Array: peak element in mountain of array


/*public class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,4,3,2};
        int ans =  binarySearch(arr);
        System.out.println(+ ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid + 1]){
                end =  mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}*/
/*import java.util.Arrays;
class FirstAndLastPosition{
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 7; 
        //int count = 0;
        int nums = binarySearch(arr,target);
        System.out.println(+ nums);


    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end  = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                count = count + 1;
                
            }
        }
        return count;
    }
     
}*/


