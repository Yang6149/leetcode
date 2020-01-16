package pickOne;

import org.junit.Test;

public class L96 {
    public int numTrees(int n) {
        int [] G=new int[n+1];
        G[0]=G[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }

    @Test
    public void downtree(){
        System.out.println(numTrees(3));
    }
}
