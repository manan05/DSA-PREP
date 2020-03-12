class Solution {
    public int reverse(int x) {
        int z = 0;
        int m = 0;
        boolean isneg = false; // taking a boolean var to check if the number is negative or not
        if(x<0){
            x = x*-1; // making the number positive so that we only have to check once
            isneg = true;
        }
        while(x>0){
            z = x%10; //finding remainder
            if(m>Integer.MAX_VALUE/10){ // checking if the value is surpassing the int limit in the previous step
               return 0; 
            }
            m = m*10 + z;   //making the new number
            x = x/10;   //making the loop end
        }
        if(isneg == true){ //if the number was initially negative making it negative again.
            return -m;
        }
        return m;
    }
}
