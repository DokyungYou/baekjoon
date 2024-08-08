class Solution {
    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");
        
        int xNum = 0;
        int num = 0;
    
        for(int i  = 0; i < strArr.length; i+=2){
            
            if(strArr[i].equals("x")){
                xNum++;
                
            }else if(strArr[i].endsWith("x")){
               xNum += Integer.parseInt(strArr[i].substring(0, (strArr[i].length() -1)));
                
            }else{
                num += Integer.parseInt(strArr[i]);
            }
        }
        
        

        StringBuilder sb = new StringBuilder();
        if(xNum != 0){
            if(xNum == 1){
               sb.append("x");
            }else{
               sb.append(xNum).append("x");
            }
            
            if(num != 0){
                sb.append(" + ").append(num);
            }
            
        }else{
             if(num != 0){
                sb.append(num);
            }
        }
        
        return sb.toString();
    }
}