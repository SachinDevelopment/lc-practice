class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] leftProducts = new int [nums.length];
        int [] rightProducts = new int [nums.length];
        int [] products = new int [nums.length];
        
        int len = nums.length-1;
        leftProducts[0] = 1;
        rightProducts[len] = 1;
        
        for(int i = 1; i < leftProducts.length; i++){
            leftProducts[i]=leftProducts[i-1]*nums[i-1];
        }
        
       for(int i = len-1; i >= 0; i--){
            rightProducts[i]=rightProducts[i+1]*nums[i+1];
        }
        
        for(int i = 0; i < products.length; i++){
            products[i] = leftProducts[i] * rightProducts[i];
        }
        
        return products;
    }
}


