import java.util.ArrayList;

import javax.management.ListenerNotFoundException;

import org.w3c.dom.Node;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> nodeList = new ArrayList<ListNode>();
        if(head == null){
            return null;
        // } else if(head.next == head){
        //     return null;
        } else {
            while(head != null){
                nodeList.add(head);
                if(nodeList.contains(head.next)){
                    return head.next;
                }
                head = head.next;
            }
            return null;
        }
    }
}