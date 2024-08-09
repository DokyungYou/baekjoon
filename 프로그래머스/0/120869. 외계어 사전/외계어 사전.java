/*문제설명에는 한번씩만 모두 사용한 단어라고 해놨지만, 제한사항과 입출력 예에는 해당 케이스 내용이 안보여서,
한번씩만 사용했다는 조건을 빼고 풀었다.*/ 
class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int cnt; 
        for(int i = 0; i < dic.length; i++){
            cnt = 0;
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])) cnt++;
            }
            if(cnt >= spell.length) return 1;
                
        }
        return 2;
    }
}