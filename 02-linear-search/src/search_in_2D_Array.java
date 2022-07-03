public class search_in_2D_Array {
    public static void main(String[] args) {

        int [][] arr = {
                {23, 45, 67},
                {58, 69, 98},
                {99, 100, 221}
          };

        int target = 98;

        System.out.println(search(arr, target));
    }

    static int search(int[][] arr, int target){

        for(int row = 0; row< arr.length; row++){
            for (int col = 0; col< arr.length; col++){

                if(arr[row][col]== target){

                    return 1;
                }
            }
        }

        return -1;
    }
}
