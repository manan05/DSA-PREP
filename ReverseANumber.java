
public class ReverseANumber {
    public int reverse(int x) {
        int z = 0;
        long m = 0;
        while(x!=0){
            z = x%10;
            m = m*10 + z;
            x = x/10;
        }
        if(m>Integer.MAX_VALUE || m<Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int)m;
        }
        
        
    }
}