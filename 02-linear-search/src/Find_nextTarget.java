public class Find_nextTarget {
    public static void main(String[] args) {

        int [] arr ={23, 3, 45, 67 , 78, 90, 6};
        int target = 78;
        int nextTraget = 90;

        System.out.println(search(arr, target));

    }

    static int search( int [] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {

                target = arr[i+1];

                return target;
            }
        }
        return -1;
    }
}
