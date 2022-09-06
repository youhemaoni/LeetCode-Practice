package com.cici.leetcode.practice.J0002_ADD_TOW_NUMBERS;

/**
 * @Classname AddTowNumbers
 * @Description TODO
 * @Date 2022/9/6 8:32
 * @Created by cici
 */
public class AddTowNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode head = null, tail = null;
    int carry = 0;
    while (l1 != null || l2 != null)
    {
      int a = l1 != null ? l1.val : 0;
      int b = l2 != null ? l2.val : 0;
      int sum = a + b + carry;
      if(head==null)
      {
        head = tail = new ListNode(sum%10);
      }else{
        tail.next = new ListNode(sum%10);
        tail=tail.next;
      }

      carry = sum / 10;
      if(l1 != null)
        l1 = l1.next;
      if(l2 != null)
        l2 = l2.next;
      if(carry > 0)
        tail.next = new ListNode(carry);

    }

    return head;
  }

  public static void main(String[] args) {
    AddTowNumbers e = new AddTowNumbers();
    ListNode l1 = new ListNode(1);
    l1.next=new ListNode(2);
    l1.next.next=new ListNode(3);
    ListNode l2 = new ListNode(1);
    l2.next=new ListNode(2);
    l2.next.next=new ListNode(3);
    ListNode listNode = e.addTwoNumbers(l1, l2);
    System.out.println(listNode.toString());
  }
}




 class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
