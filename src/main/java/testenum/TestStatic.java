package testenum;

import org.junit.Test;

public class TestStatic {
    public static int a=2;
    public static void sot(){
        System.out.println(a);
    }
    @Test
    public void test(){
        System.out.println(TestStatic.a);
        TestStatic b = new TestStatic();
//        b.sot();
//        System.out.println(b.a);
    }
}
