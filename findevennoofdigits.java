class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
     boolean even(int num)
    {
        int noofdigits = digits(num);
        return noofdigits %2 == 0 ;
    }
     
      int digits(int num)
    {
        if(num < 0){
            num = num * -1;
        }
        if(num ==0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    
    
}
