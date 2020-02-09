package basicUnit;

public class isPrime {
    public static boolean isPrime(long n){
        for(int i=5;i*i<n;i+=6){
            if(n%i==0||(n%(i+2)==0)){
                return false;
            }
        }
        return true;
    }
}
