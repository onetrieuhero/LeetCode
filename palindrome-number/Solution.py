class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        checked_string = ""
        if(x < 0):
            return False
        
        checked_string = str(x)[::-1]
        if(checked_string == str(x)):
            return True
        else:
            return False
            
