package logical;

public class RemoveDuplicatesFromAnSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,6,6};;
        int rd=0;

        for(int i =1; i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        } 

        for(int i = 0; i<=rd;i++){
            System.out.println(arr[i]);
        }
    }
}
