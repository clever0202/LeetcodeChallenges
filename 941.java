class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean increasing = true;
        boolean changed = false;
        int max = arr[0];
        if(arr.length<3){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(increasing){
                if(i == arr.length -1){
                    return false;
                }
                if(arr[i+1] < arr[i]){
                    increasing = false;
                    changed = true;
                } else if(arr[i+1] == arr[i]){
                    return false;
                } else if(arr[i+1] > arr[i]){
                    max = arr[i+1];
                }
            } else if(increasing == false){
                if(i < arr.length -1){
                    if(arr[i+1] >= arr[i]){
                        return false;
                    }
                }
            }
        }
        if(max == arr[0]){
            return false;
        }
        if(changed){
            return true;
        } else {
            return false;
        }
    }
}