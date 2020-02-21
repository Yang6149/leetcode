package jianzhiOffer;

import java.util.ArrayList;

public class L6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        print(listNode,list);
        return list;
    }
    public void print(ListNode list,ArrayList<Integer> arrayList){
        if(list==null)return;
        print(list.next,arrayList);
        arrayList.add(list.val);
    }
}
