class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] map = new int[n];
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                int topIndex = stack.pop();
                int diff = i-topIndex;
                map[topIndex] = diff;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int topIndex = stack.pop();
            map[topIndex] = 0;
        }
        return map;
    }
}