class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        d=d%arr.length;
        int[] dup=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            dup[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[index]=dup[i];
            index++;
        }
        for(int i=0;i<d;i++){
            arr[index]=dup[i];
            index++;
        }
    }
}