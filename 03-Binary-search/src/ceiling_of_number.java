public class ceiling_of_number {
    public static void main(String[] args){
        // before apply binary search make sure that given array should be sorted array,
        int [] arr = {2, 3, 5, 45, 67, 89, 90};
        int target = 46;

        int ans = ceiling(arr, target);
        System.out.println(ans);

    }
   //ceiling -> smallest element in array greater or = target.
    static int ceiling(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;

        while (s<=e){

            int mid = s+(e-s)/2;

            if(target<arr[mid]){
                e = mid-1;
            }

            else if(target>arr[mid]){
                s = mid+1;
            }

            else{

                return mid;
            }
        }
        // ans it's returning index of element
        return s;
    }
}

