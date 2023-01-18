package homework1;

public class Leetcode13 {
	
	public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for(int j = 0; j < nums.length-1; j++){
            if(nums[j] < nums[j+1]){
                sum -= nums[j];
            }
            else{
                sum += nums[j];
            }
        }
        return sum+nums[nums.length-1];
    }
}
