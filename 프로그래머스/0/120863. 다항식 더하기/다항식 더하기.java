class Solution {
    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");
        
        String answer="";
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
        
        
        // x가 0, 1 일때
        // 상수항이 0 일 때
        if(xNum != 0){
            if(xNum == 1){
                answer += "x";
            }else{
                answer+= xNum + "x";
            }
            
            if(num != 0){
                answer+= " + " + num;
            }
            
        }else{
             if(num != 0){
                answer+= num;
            }
        }
        
        
        
       
        
        
        return answer;
    }
}