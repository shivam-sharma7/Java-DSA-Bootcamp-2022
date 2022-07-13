public class find_peak_element {
    public static void main(String[] args) {
        // it's mean find max element in array,

        int [] arr = {1, 2, 3, 5, 6, 4, 3, 2};

        System.out.println(peakMountainArray(arr));
    }

    static int peakMountainArray(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s+(e-s)/2;

            if(arr[mid] > arr[mid+1]){

                e = mid;
            }
            else{
                s = mid+1;
            }
        }

        return s;
    }
}
