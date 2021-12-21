class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n == 0:
            return False
        elif n == 1:
            return True
        elif n%2 != 0:
            return False
        else:
            k = n/2
            if k == 1:
                return True
            else:
                while True:
                    if k%2 != 0:
                        return False
                    else:
                        k = k/2
                        if k == 1:
                            return True
                            
                    