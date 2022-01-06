class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int stop = 1;
        int done = 0;
        int passengers = 0;
        while(done < trips.length){
            for(int i=0; i<trips.length; i++){
                // int passengers = 0;
                if(trips[i][1] == stop){
                    passengers += trips[i][0];
                } else if(trips[i][2] == stop){
                    passengers -= trips[i][0];
                    done += 1;
                }
                
            }
            if(passengers > capacity){
                return false;
            }
            stop += 1;
        }
        return true;
    }
}