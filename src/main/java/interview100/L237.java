package interview100;

import org.junit.Test;
import recursion.SwapNodeInPair.*;

import java.util.List;

public class L237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

}
