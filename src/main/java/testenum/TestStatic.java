package testenum;

import org.junit.Test;

public class TestStatic {
    public static int a=2;
    @Test
    public void test(){
        System.out.println(TestStatic.a);
//        TestStatic b = new TestStatic();
//        System.out.println(b.a);
    }
}
