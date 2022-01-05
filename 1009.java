import java.util.ArrayList;

class Solution {
    public int bitwiseComplement(int n) {
        ArrayList twos = new ArrayList<Integer>();
        int m = 100;
        int left = 0;
        if(n ==1 ){
            return 1;
        }
        while(n>0){
            twos.add(n%2);
            n = n/2;
        }
        for(int i=0; i<twos.size(); i++){
            if(twos.get(i) == Integer.valueOf(0)){
                twos.set(i, Integer.valueOf(1));
            } else if(twos.get(i) == Integer.valueOf(1)){
                twos.set(i, Integer.valueOf(0));
            }
        }
        int result = 0;
        for(int i=0; i<twos.size(); i++){
            int k = 0;
            if(twos.get(i) == Integer.valueOf(0)){
                k = 0;
            } else if(twos.get(i) == Integer.valueOf(1)){
                k = 1;
            }
            double plus = k * Math.pow(2,i);
            result += plus;
        }
        return result;
    }
}