package Level0;

public class level0_16 {

    class Solution {
        public int solution(int n) {
            int answer = 0;

            if(n%7 == 0){
                answer = n / 7;
            }else{
                answer = n / 7 + 1;
            }

            return answer;

//            return (int)Math.ceil((double) n / 7);
        }
    }

}
