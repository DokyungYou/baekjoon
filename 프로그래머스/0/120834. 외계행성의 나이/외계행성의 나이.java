class Solution {
    public String solution(int age) {
        
        int a = 97; // 소문자 a == 97 (유니코드)
        StringBuilder sb = new StringBuilder();
        
        // 10자리 수만큼 쪼개가기
        while(age != 0){
            sb.insert(0, (char)(a + (age % 10)));
            age /= 10;
        }
        return sb.toString();
    }
}