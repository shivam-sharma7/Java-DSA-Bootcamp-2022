public class Even_Odd_Array {
    public static void main(String[] args) {

        int [] arr = {2, 45, 32, 56, 6, 34};

        even_odd(arr);

    }

    static void even_odd(int[] arr){

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){
                System.out.println("even -> "+ arr[i]);
            }
            else{
                System.out.println("odd -> "+ arr[i]);
            }
        }
    }
}
