package contest.contest180;

public class L5357 {
    int top=0;
    int bottom=0;
    int [] stack ;
    int capacity ;
    public L5357(int maxSize) {
        stack = new int[maxSize];
        capacity=maxSize;
    }

    public void push(int x) {
        if(top==capacity)return;
        stack[top++]=x;
    }

    public int pop() {
        if (top==0)return -1;
        return stack[--top];
    }

    public void increment(int k, int val) {
        int bot=bottom;
        for (int i=0;i<k;i++){
            if(i==top)break;
            stack[i]+=val;
        }

    }

    public static void main(String[] args) {
        L5357 a = new L5357(3);
        a.push(1);
        a.push(2);
        a.pop();
        a.push(2);
        a.push(3);
        a.push(4);
        a.increment(5,100);
        a.increment(2,100);
        a.pop();
        a.pop();
        a.pop();
        a.pop();
    }
}
