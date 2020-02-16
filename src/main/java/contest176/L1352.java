package contest176;

import java.util.ArrayList;

public class L1352 {
    class ProductOfNumbers {

        int size = 0;
        ArrayList<Integer> list ;
        public ProductOfNumbers() {
            list = new ArrayList<>();
        }

        public void add(int num) {
            list.add(num);
            size++;
        }

        public int getProduct(int k) {
            int res = 1;
            for(int i=size-1;i>=size-k;i--){
                res*=list.get(i);
            }
            return res;
        }
    }
}
