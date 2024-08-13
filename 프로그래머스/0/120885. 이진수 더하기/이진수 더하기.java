class Solution {
    public String solution(String bin1, String bin2) {
    
        return Integer.toBinaryString(toDecimalNum(bin1) + toDecimalNum(bin2));
    }
    
    
    static int toDecimalNum(String binaryString){
        int n = binaryString.length();
        int result = (binaryString.charAt(n-1) - '0') * 1;
        
        int squareNum = 1;
        for(int i = n-2; i >= 0 ; i--){
            squareNum*=2;
            result += (binaryString.charAt(i) -'0') * squareNum;
        }
        
        return result;
    }
}