class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        int[] arr = new int[26];
        for(char c : s1.toCharArray())arr[c - 'a']++;
        for(char c : s2.toCharArray())arr[c - 'a']--;
        for(int i : arr)if(i != 0)return false;
        return true;
    }
}