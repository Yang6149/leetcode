package ten;

public class L2 {

    People [] peoples;
    People head;
    People teal;
    int size;


    public L2(People[] peoples) {
        this.peoples = peoples;
    }

    public static class People{
        int id;
        People pre;
        People next;
        boolean isCheck;
        int ID ;
        People [] list;

        public People(int id, People pre) {
            this.id = id;
            this.pre = pre;
            this.next = next;

        }
    }

    public static void main(String[] args) {

    }

    public People findN(int n){
        People cur = teal;
        for(int i=1;i<n;i++){
            cur=cur.pre;
        }
        return cur;
    }

    public void prinT(){


    }


}
