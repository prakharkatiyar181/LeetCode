class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();
        List<String> l1 = Arrays.asList(list1);
        List<String> l2 = Arrays.asList(list2);
        List<String> common = new ArrayList<>();
        for(String s:list2){
            if(l1.contains(s))common.add(s);
        }
        ans.add(common.get(0));
        int firstind = l1.indexOf(common.get(0))+l2.indexOf(common.get(0));
        for(int i=1;i<common.size();i++){
            int minind = l1.indexOf(common.get(i))+l2.indexOf(common.get(i));
            if(minind < firstind){   
                ans.clear();
                ans.add(common.get(i));
            }
            else if(minind == firstind){
                ans.add(common.get(i));
            }
            else{
                continue; 
            }
        }            
        return ans.toArray(new String[ans.size()]);
    }
}