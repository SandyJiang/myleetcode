package com.js.myleetcode_1_20;

/**
 * @author jiangsai
 * @create 2019-01-17 18:30
 */
public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        ListNode f1_1 = new ListNode(1);
        ListNode f1_2 = new ListNode(8);
        ListNode f1_3 = new ListNode(3);
        f1_1.next = f1_2;
        /* f1_2.next = f1_3;*/
        ListNode f2_1 = new ListNode(0);
        ListNode f2_2 = new ListNode(6);
        ListNode f2_3 = new ListNode(4);
       /* f2_1.next = f2_2;
        f2_2.next = f2_3;*/
        ListNode l3 = addTwoNumbers(f1_1, f2_1);
        System.out.println(l3);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = null;
        int nflag = 0;
        while(l1 != null || l2 != null || nflag != 0){
            int temp = 0;
            if(l1 != null || l2 != null){
                if(l1 != null){
                    temp = temp + l1.val;
                }
                if(l2 != null){
                    temp = temp + l2.val;
                }
                if(nflag == 1){
                    temp = temp+nflag;
                    nflag = 0;
                }
                if(temp >= 10){
                    temp = temp%10;
                    nflag = 1;
                }
            }else{
                temp = nflag;
                nflag = 0;
            }

            ListNode t = new ListNode(temp);
            if(l3 == null){
                l3 = t;
            }else{
                ListNode t3 = l3;
                while(t3.next != null){
                    t3 = t3.next;
                }
                t3.next = t;
            }

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        return l3;
    }
}


class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x;}
}
