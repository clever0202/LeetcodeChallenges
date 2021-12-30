import java.math.BigInteger;

class Solution {
    public int smallestRepunitDivByK(int k) {
        int count = 1;
        BigInteger div = BigInteger.valueOf(k);
        BigInteger num = BigInteger.ONE;
        while(true){
            if(k%2 == 0){
                return -1;
            } else if (k%5 == 0){
                return -1;
            } else {
                if(count > 100000){
                    return -1;
                } else if(num.mod(div) == BigInteger.ZERO){
                    return count;
                } else {
                    num = num.multiply(BigInteger.TEN);
                    num = num.add(BigInteger.ONE);
                    count += 1;
                }
            }
        }
    }
}