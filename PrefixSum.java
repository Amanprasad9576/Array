public class PrefixSum {
    static int PrefixSum(int []arr,int l,int r){
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int sum=prefix[r]-prefix[l];
        return sum;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
        int res=PrefixSum(arr,2,4);
        System.out.println(res);
    }
}
