public class find_target_true {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        System.out.println(search(arr, target));
    }

    static boolean search(int[] arr, int target){

        //basic check
        if(arr.length==0){
            return false;
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){

                return true;
            }
        }

        return false;
    }
}
