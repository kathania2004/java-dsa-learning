/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] nums = {23,12,77,33,2,5,4,7,19,28};
        int target = 19;
        System.out.println("item to be found: " + target);
        int ans = search(nums,target);
        System.out.println(nums.length);
        System.out.println("element found at " + ans);

    }

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
 
}*/
/*import java.util.Scanner;
import java.util.Arrays;

public class linearSearch{
    public static void main(String[] args){
        int[] num = {10,20,2,3,5,20,50,6,77,34};
       // System.out.print(Array.toString(nums));
        int target = 77;
        System.out.println("the item to be found is: " + target);
        int ans = search(num,target);
        System.out.println("item found is :" + ans);
    }

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}*/
/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] nums = {10,22,34,55,56,78,96,34,24,26};
        int target = 96;
        System.out.println("item to be found is: " + target);
        int ans = search(nums,target);
        System.out.println("number found at " + ans);
    }

    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}*/
/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        String str = "Himanshu";
        char target = 'a';
        System.out.println("charcter to be searched " + target);
        System.out.println(search(str,target));
    }

    static boolean search(string str,char target){
        if(str.length == 0){
            return false;
        }
        for(int index = 0;index<str.length;index++){
           // char element = str[index];
            if(target == charAt[i]){
                return true;
            }
        }
        return false;
    }

}*/

// TO FIND THE MINIMUM ELEMENT IN AN ARRAY

/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] arr = {11,3,1,4,9};
        int s = arr[0];
        int ans = min(arr,s);
    }

    static int min(int[] arr,int s){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 1;index<arr.length;index++){
            if(s<arr[index]){
               s = arr[index];
            }
        }
        return -1;
    }
}*/
//TO FIND THE MAIXIMUM ELEMENT IN A AN ARRAY
/*
import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] arr = {12,2,44,63,53,75,2,7};
        int value = arr[0];
        int maxValue = max(arr,value);
        System.out.println(+ maxValue);

    }
    static int max(int[] arr,int value){
        if(arr.length == 0){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>value){
                value = arr[i];
            }
        }
        //System.out.println("the maximum value in the array is " + value);
        return value;
    }
}*/
/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] arr = {1,2,4,3,6,4,88,66};
        int target = 88;
        int ans = search(arr,target);
        System.out.println(+ ans);
    }
    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}*/
//Count occurrences of a number.

/*import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] arr = {1,2,1,3,1,4,1,6};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the numbers whose occurences to be found is " + num);
        int ans = countDigit(arr,num);
        System.out.println(+ans);
    }
    static int countDigit(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                count = count +1;
            }
        }
        return count;
    }
}*/

//Find the second largest element.

import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args){
        int[] arr = {56,12,33,44,55,21,34};
        int value = arr[0];
        int ans = secondLargest(arr,value);
        System.out.println(+ ans);
        
    }
    static int secondLargest(int[] arr,int value){
        int sLargest = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i]>value){
                sLargest = value;
                value = arr[i];
            }else if(arr[i]>sLargest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}*/
