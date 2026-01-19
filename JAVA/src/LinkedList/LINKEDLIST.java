package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class MyLinekedlist{
    Node head;
    void inset(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
            System.out.print("NULL");
    }
    void insatlast(int data){
        Node temp= head;
        Node newnode=new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        if(head==null){
            head=newnode;
        }
        temp.next=newnode;

    }
    void delstart(){
        head=head.next;
    }
    void delnode(int data){
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }

    }
}
class LinkedMan{
    static void main() {
        MyLinekedlist ll=new MyLinekedlist();
        ll.inset(10);
        ll.inset(20);
        ll.inset(30);
        ll.inset(40);
        ll.inset(50);
        ll.inset(60);
        ll.inset(70);
        ll.insatlast(100);
        ll.delstart();
        ll.delnode(40);
        ll.display();
    }
}