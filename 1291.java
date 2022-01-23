import java.util.ArrayList;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int start = 1;
        int k = 2;
        int n = 10;
        List<Integer> ret = new ArrayList<Integer>();
        while(start < 9){
            n += k;
            // System.out.println(n);
            if(n > high || k >= 10){
                start += 1;
                k = start + 1;
                n = start * 10;
            } else{
                if(n >= low && n <= high){
                    ret.add(n);
                }
                n = n * 10;
                // System.out.println(n);
                k = k + 1;
            } 
        }
        Collections.sort(ret);
        return ret;
    }
}

