class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> pre = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            List<Integer> arr1 = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    arr1.add(1);
                else
                    arr1.add(pre.get(j)+pre.get(j-1));
            }
            pre=arr1;
            arr.add(arr1);
        }
        return arr;
    }
}