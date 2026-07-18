/*public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        System.out.println(search(arr, target));   // Output: 2
        System.out.println(pivotElement(arr));      // Output: 3
    }

    static int search(int[] arr, int target) {

        int pivot = pivotElement(arr);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // Target is the pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // Search in left half
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        // Search in right half
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Left half is sorted, so pivot is in right half
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}*/

/*class RotatedArray{
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2};
        int target = 8;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr,int target){
        int pivot = pivotElement(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot - 1);
            }else{
                return binarySearch(arr,target,pivot + 1,arr.length - 1);
            }
        }
    }
    static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid < end && arr[mid] < arr[mid - 1] ){
                return mid - 1;
            }
            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}*/

/*public class RotatedArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2};
        int target = 4;

        int ans = search(arr, target);
        System.out.println("Target found at index: " + ans);

        int pivot = pivotElement(arr);
        System.out.println("Pivot index: " + pivot);
    }

    static int search(int[] arr, int target) {

        int pivot = pivotElement(arr);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // Target is the pivot element
        if (arr[pivot] == target) {
            return pivot;
        }

        // Decide which half to search
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int pivotElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: element before mid is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end-1 is pivot
                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }

            // Left half is sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start = mid + 1;
            }

            // Right half is sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}*/
// for duplicate elements

/*class RotatedArray{
    public static void main(String[] args){
        int[] arr = {2,2,2,2,2,9,1,0};
        int target = 9;
        int ans = pivotElement(arr);
        System.out.println(+ ans);
    }
    static int pivotElement(int[] arr){
        int start = 0;
        int end =  arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

        // case1 if middle element is mid
        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }
        //case 2 if mid - 1 is the pivot 
        if(mid > start && arr[mid] < arr[mid - 1]){
            return mid - 1;
        }
        //case 3 search for duplicates
        if(arr[start] == arr[mid] && arr[mid] == arr[end]){
            //check if start is pivot or not
            if(start < end && arr[start] > arr[start + 1]){
                return start;
            }
            start++;
            //check if end - 1 is pivot
            if(end > start && arr[end - 1] > arr[end]){
                return end - 1;
            }
            end--;
            }

            //case left half is sorted
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                //left half is sorted 
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        
        }
        return -1;
    }
}*/

/*class RotatedArray{
    public static void main(String[] args){
        int[] arr = {15,18,2,3,6,12};
        int ans = countRotation(arr);
        System.out.println(+ ans);
    }
    static int countRotation(int[] arr){
        int pivot = pivotElement(arr);
        if(pivot == -1){
            System.out.println("array not rotated");
            return -1;
        }else{
            return pivot + 1;
        }
    }
    static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }

            if(arr[mid] >= arr[start]){
                start =  mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}*/
/*class RotatedArray{
    public static void main(String[] args){
        int[] arr = {11,12,13,14};
        int ans = minEle(arr);
        System.out.println(+ ans);
        int ans = pivotElement(arr);
        System.out.println(+ ans);

    }
    static int minEle(int[] arr){
        int pivot = pivotElement(arr);
        if(pivot == -1){
            return arr[0];
        }else{
            return pivot + 1;
        }
    }
    static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}*/
// to find minimum element in rotated array full of  duplicates 
class RotatedArray{
    public static void main(String[] args){
        int[] arr = {10,1,10,10,10};
        int ans = search(arr);
        System.out.println(+ ans);
    }
    static int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else if(arr[mid] < arr[end]){
                end = mid;
            }else{
                end--;
            }
        return nums[start];
    }
}