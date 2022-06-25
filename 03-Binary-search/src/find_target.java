public class find_target {
    public static void main(String[] args) {
        // before apply binary search make sure that given array should be sorted array,
        int [] arr = {2, 3, 5, 45, 67, 89, 90};
        int target = 45;

        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){

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
                //ans = 3 in this case
                return mid;
            }
        }

        return -1;
    }
}
