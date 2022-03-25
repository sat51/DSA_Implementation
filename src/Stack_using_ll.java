public class Stack_using_ll {
    Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
        void push(int data)
        {   
            if(isEmpty())
            System.out.println("Empty stack");
            else{
                Node temp = new Node(data);
                temp.next = head;
                head = temp;}
        }
        int  peek() throws Exception
        {
            if(head == null)
                throw new Exception("stack is empty");
            return head.data;
        }
        int pop() throws Exception
        {
            if(head == null)
                throw new Exception("stack is empty");
            int res = head.data;
            head = head.next;
            return res;
        }
        boolean isEmpty()
        {
            return head == null;
        }


    public static void main(String[] args) {
        Stack_using_ll a = new Stack_using_ll();
        a.push(1);

    }

}
