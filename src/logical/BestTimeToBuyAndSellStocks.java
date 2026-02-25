package logical;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4,9};
        int i = 0, j = 1, maxProfit = 0;
        while (j<arr.length){
            if(arr[j]-arr[i]>maxProfit)
                maxProfit=arr[j]-arr[i];
            if(arr[j]<arr[i])
                i=j;

            j++;
        }

        System.out.println(maxProfit);
    }
}
