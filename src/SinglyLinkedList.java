public class SinglyLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next = null;
        }
    }
    Node head;
    public void PrintAll(Node head)
    {
        int Count = 0;
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
            Count+=1;
        }
        System.out.println("\n"+Count);
    }
    public void insert_first(int new_data) //insertion at first position
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    public void insert_last(int new_data,Node prev_Node)
    {
        Node new_Node = new Node(new_data);
        if(prev_Node.next == null)
        {
            prev_Node.next = new_Node;
            new_Node.next = null;
        }
    }
    public void insert_after(Node prev_Node,int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = prev_Node.next;
        prev_Node = new_Node.next;
    }
    public Node insert_at_specific_position(Node head,int pos,int x)
    {
        Node n = new Node(x);
        if(pos <1 )
        {
            System.out.println("invalid position");
        }
        else
        {
            if(pos == 1)
            {
                n.next = head;
                head = n;
            }
            else
            {
                int c =1;
                Node p = head;
                while(c<pos-1 && p!=null)
                {
                    p = p.next;
                    c++;
                }
                n.next = p.next;
                p.next = n;
            }
        }
        return head;
    }
    public Node insert_before_node_at_specific_position(int data,int pos)
    {
        Node n = new Node(data);
        int c = 1;
        Node p = head;
        if(pos<1)
        {
            System.out.println("invalid position");
            return null;
        }
        while(c<pos-2 && p!=null)
        {
            p = p.next;
            c++;
        }
        n.next = p.next;
        p.next = n;
        return head;
    }
    public Node insert_after_node(int pos,int x)
    {
        Node n = new Node(x);
        Node p = head;
        int c =1;
        if(pos<1)
        {
            System.out.println("invalid position");
        }
        else
            while(c<pos && p!=null)
            {
                p=p.next;
                c++;
            }
            n.next = p.next;
            p.next = n;
            return head;
    }
    public Node reverse_list(Node head)
    {
        if(head == null)
        {
            System.out.println("invalid action");
        }
        if(head.next == null)
        {
            System.out.println("only one element present");
            return head;
        }
        Node prenode = null;
        Node currentnode = head;
        while(currentnode!=null)
        {
            Node nextnode = currentnode.next;
            currentnode.next = prenode;
            prenode = currentnode;
            currentnode = nextnode;
        }
        head = currentnode;
        return head;
    }
    void print_reverse_list(Node head)
    {
        if(head == null)
            return;
        print_reverse_list(head.next);
        System.out.print(head.data);
    }
    

    public Node delete_first()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("invalid action,linked list is empty");
            return null;
        }
        if(temp.next == null)
        {
            System.out.println("Ll have only element,now the LL is empty");
            return null;
        }
        return temp.next;
    }
    public Node delete_last()
    {
        Node temp = head;
       if(temp == null)
       {
           System.out.println("ll is empty");
           return null;
       }
       if(temp.next == null)
       {
           System.out.println("only one node is present,ll is empty");
           return null;
       }
       while(temp.next.next != null)
       {
           temp = temp.next;
       }
       temp.next = null;
       return head;
    }
    public Node delete_at_specific_position(int pos)
    {
       int c =1;
       Node p = head;
       while(c<pos-1)
       {
           p=p.next;
           c++;
       }
       p.next = p.next.next;
       return head;

    }
    public Node delete_before_Node(int pos)
    {
        int c = 1;
        Node p = head;
        while(c<pos-2)
        {
            p = p.next;
            c++;
        }
        p.next = p.next.next;
        return head;
    }
    public Node delete_after_Node(int pos)
    {
        int c = 1;
        Node p = head;
        while(c<pos)
        {
            p = p.next;
            c++;
        }
        p.next = p.next.next;
        return head;
    }
    public boolean Search(Node head,int x)
    {
        Node p = head;
        while(p!=null)
        {
            if(p.data == x)
                return true;
            p = p.next;

        }
        return false;
    }


    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        a.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        a.head.next = second;
        second.next = third;
        a.insert_first(5);
        a.insert_before_node_at_specific_position(9,3);
       // a.delete_after_Node(4);
        //a.print_reverse_list(a.head);
        a.PrintAll(a.head);
        //a.print_reverse_list(a.head);

    }
}
