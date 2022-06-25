public class find_target {
    public static void main(String[] args) {
        // we can array like this
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int ans =  linear(arr, target);

        System.out.println(ans);
    }

    static int linear(int [] arr, int target){

        // traversing the array via for loops
        for(int i= 0; i< arr.length; i++){

            if(target==arr[i]){

                return target; // we can return element index also like return i;
            }
        }
        //this mean if element is not present in array so return -1;
         return -1;
    }
}

