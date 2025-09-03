/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Stack<Node> st=new Stack();
        Node temp=head;
        while(temp!=null){
            st.add(temp);
            temp=temp.next;
        }
        Node newhead=st.pop();
        Node curr=newhead;
        curr.prev=null;
        
        while(!st.isEmpty()){
            // newhead=st.pop();
            // curr.next=newhead;
            // curr=newhead;
            Node node=st.pop();
            curr.next=node;
            node.prev=curr;
            curr=node;
        }
        curr.next=null;
        return newhead;
    }
}