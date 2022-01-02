import java.util.ArrayList;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        // for(int i=0; i<time.length; i ++){
        //     for(int j= i+1; j<time.length; j ++){
        //         if((time[i] + time[j])%60 == 0){
        //             count += 1;
        //         }
        //     }
        // }
        int[] mod = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        // for(int i=0; i<60; i ++){
        //     int x = 0;
        //     mod.add(x);
        // }
        ArrayList sixty = new ArrayList<Integer>();
        ArrayList thirty = new ArrayList<Integer>();
        for(int i=0; i<time.length; i ++){
            int leftover = time[i]%60;
            // if(leftover == 60){
            //     sixty.add(time[i]);
            // } else if(leftover == 30){
            //     thirty.add(time[i]);
            // }
            mod[leftover] = mod[leftover] + 1;
        }
        for(int i=1; i<30; i++){
            int plus = mod[i] * mod[mod.length-i];
            count += plus;
        }
        if(mod[30] == 0 || mod[30] == 1){
            count += 0;
        } else {
            count += (mod[30]) * (mod[30]-1) * 0.5;
        }
        if(mod[0] == 0 || mod[0] == 1){
            count += 0;
        } else {
            count += (mod[0]) * (mod[0]-1) * 0.5;
        }
        return count;
    }
}