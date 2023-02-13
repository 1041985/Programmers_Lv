import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> ponketmon = new HashMap();
        for(int num: nums){
            ponketmon.put(num,ponketmon.getOrDefault(num,0)+1);
        }

        if(ponketmon.size() > nums.length/2){
            answer = nums.length/2;
        }
        else {
            answer = ponketmon.size();
        }
        return answer;
    }
}