package recursion;

public class ReverseString {
    public void recursion(char[] s,int begin,int end){
        if(begin>=end)return;
        char temp=s[begin];
        s[begin]=s[end];
        s[end]=temp;
        
        recursion(s,++begin,--end);
    }
    public static void main(String[] args) {

    }
}
