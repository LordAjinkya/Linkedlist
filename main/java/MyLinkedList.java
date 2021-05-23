public class MyLinkedList {
    //public INode tail;
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //adding new node
    public void add(INode newNode) {
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    //printing nodes
    public void printmyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes :");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
