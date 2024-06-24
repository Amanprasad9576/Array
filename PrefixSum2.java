public class PrefixSum {
    static int PrefixSum(int []arr,int l,int r){
        for(int i=1;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        int sum=arr[r]-arr[l];
        return sum;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
        int res=PrefixSum(arr,2,4);
        System.out.println(res);
    }
}
