import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    //test case for add number 56 ,30 ,70 in linkedList
    public void given3NumbersWhenLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add((INode) myFirstNode);
        myLinkedList.add((INode) mySecondNode);
        myLinkedList.add((INode) myThirdNode);
        myLinkedList.printmyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
    //test case for appending number 30 between 56 and 70
    @Test
    public void given3Numbers_Append_To_LinkedListShouldBeAdded_At_Last() {
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printmyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
}
