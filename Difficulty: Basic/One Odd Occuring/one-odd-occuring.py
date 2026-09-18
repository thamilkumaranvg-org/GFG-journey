class Solution:
    def getOddOccurrence(self, arr):
        # code here 
        result = 0
        for i in arr:
            result ^= i
        return result