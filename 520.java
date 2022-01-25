class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == word.toUpperCase() || word == word.toLowerCase()){
            return true;
        } else {
            String newstring = word;
            if(Character.toString(newstring.charAt(0)) == Character.toString(word.charAt(0)).toUpperCase() && newstring.substring(1).equals(word.substring(0).toLowerCase())){
                return true;
            } else {
                return false;
            }
        }
    }
}