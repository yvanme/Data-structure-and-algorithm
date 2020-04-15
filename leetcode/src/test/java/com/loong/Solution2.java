package com.loong;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int value = l1.val+l2.val;
        int y = value%10;
        int v = value/10;
        ListNode listNode = new ListNode(y);
        ListNode cListNode = listNode;
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;
        while(next1!=null||next2!=null){

            if(next1!=null){
                v = v+next1.val;
                next1 = next1.next;
            }
            if(next2!=null){
                v = v+next2.val;
                next2 = next2.next;
            }
            y = v%10;
            v = v/10;
            ListNode next = new ListNode(y);
            cListNode.next = next;
            cListNode = next;

        }
        if(v>0){
            ListNode next = new ListNode(v);
            cListNode.next = next;
        }
        return listNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode listNode1= new ListNode(2);
//        ListNode listNode2= new ListNode(4);
//        ListNode listNode3= new ListNode(3);
//
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//
//        ListNode listNode4= new ListNode(5);
//        ListNode listNode5= new ListNode(6);
//        ListNode listNode6= new ListNode(4);
//
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        ListNode result = solution.addTwoNumbers(listNode1,listNode4);

        ListNode listNode1= new ListNode(5);


        ListNode listNode4= new ListNode(5);

        ListNode result = solution.addTwoNumbers(listNode1,listNode4);
        System.out.println(result);
    }
}