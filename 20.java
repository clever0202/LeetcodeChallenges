import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        int smallcount = 0;
        int medcount = 0;
        int largecount = 0;
        String smallopen = "(";
        String smallclose = ")";
        String medopen = "{";
        String medclose = "}";
        String largeopen = "[";
        String largeclose = "]";
        ArrayList<String> opens = new ArrayList<String>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == smallopen.charAt(0)){
                smallcount += 1;
                opens.add("s");
            } else if(s.charAt(i) == smallclose.charAt(0)){
                smallcount -= 1;
                if(opens.size() == 0){
                    return false;
                } else if(opens.get(opens.size()-1) == "s"){
                    opens.remove(opens.size()-1);
                } else {
                    return false;
                }
            }
            if(s.charAt(i) == medopen.charAt(0)){
                medcount += 1;
                opens.add("m");
            } else if(s.charAt(i) == medclose.charAt(0)){
                medcount -= 1;
                if(opens.size() == 0){
                    return false;
                }
                if(opens.get(opens.size()-1) == "m"){
                    opens.remove(opens.size()-1);
                } else {
                    return false;
                }
            }
            if(s.charAt(i) == largeopen.charAt(0)){
                largecount += 1;
                opens.add("l");
            } else if(s.charAt(i) == largeclose.charAt(0)){
                largecount -= 1;
                if(opens.size() == 0){
                    return false;
                }
                if(opens.get(opens.size()-1) == "l"){
                    opens.remove(opens.size()-1);
                } else {
                    return false;
                }
            }
            if(smallcount <0 || medcount <0 || largecount < 0){
                return false;
            }
        }
        if(smallcount ==0 && medcount ==0 && largecount ==0){
            return true;
        } else {
            return false;
        }
    }
}