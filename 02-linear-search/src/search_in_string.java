public class search_in_string {
    public static void main(String[] args) {

        String name = "Shivam";

        char target = 'v';

        System.out.println(searchChar(name, target));
    }
    static int searchChar(String name, char target){

        for(int i = 0; i<name.length(); i++){

            if(target== name.charAt(i)){

                //it will return the index of target = ans;

                return i;
            }
        }
        // when target not present then it will return -1
        return -1;
    }
}
