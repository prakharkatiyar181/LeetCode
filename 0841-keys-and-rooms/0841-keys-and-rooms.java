class Solution {
public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        
        boolean [] visited = new boolean[n];
        
        dfs(0, rooms, visited);
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                // We found one room unvisited, so return false;
                return false;
            }
        }
        // We could not find any room unvisted, so return true;
        return true;
    }
    
    private void dfs(int room, List<List<Integer>> rooms, boolean [] visited){
        visited[room] = true;
        // Visit unvisited next room's whose distinct keys are present in current room.
        for(int nextRoom : rooms.get(room)){
            if(!visited[nextRoom]){
                dfs(nextRoom, rooms, visited);
            }
        }
    }
}