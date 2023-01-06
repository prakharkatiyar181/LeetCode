class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int [] arr = new int [100001];
        for(int x : costs)arr[x]++;
        int count = 0;
        int index = 1;
//If coins can buy all the ice-cream at ith index.
        while(index<100001 && coins>=index*arr[index]){
            coins-=index*arr[index];
            count+=arr[index];
            index++;
        }
//If coins can buy onyl some of the ice-creams at ith index.
        while(index<100001 && coins>=index){
            coins-=index;
            count++;
        }
        return count;
    }
}