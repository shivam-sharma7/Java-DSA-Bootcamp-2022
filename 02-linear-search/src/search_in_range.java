public class search_in_range {
    public static void main(String[] args) {
        // we can array like this
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int s = 0;
        int e = arr.length-1;

        int ans =  linear(arr, target,1, 5);
        System.out.println(ans);
    }

    static int linear(int [] arr, int target, int s, int e){

        // traversing the array via for loops
        for(int i= s; i<e; i++){

            if(target==arr[i]){

                return target; // we can return element index also like return i;
            }
        }
        //this mean if element is not present in array so return -1;
        return -1;
    }
}

