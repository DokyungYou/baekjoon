class Solution {
    public int solution(String s) {
        int result = 0;
        String[] arr = s.split(" ");
        
        int before = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i].equals("Z")){
                result-= before;
            }else{
                before = Integer.parseInt(arr[i]);
                result += before;
            }
        }
        return result;
    }
}