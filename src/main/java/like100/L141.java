package like100;

import java.util.HashMap;

public class L141 {
    public boolean hasCycle(ListNode head) {
        ListNode walker=head,runner=head;

        while (runner.next!=null&&runner.next.next!=null){
            walker=walker.next;
            runner=runner.next.next;
            if(walker==runner)return true;
        }
        return false;
    }
}
