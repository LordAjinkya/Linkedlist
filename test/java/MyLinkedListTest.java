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
    //inserting 30 between 56&70
    @Test
    public void given3Numbers_pop_FirstNumber_ShouldBeDelete_From_Top() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printmyNodes();
        myLinkedList.pop(myFirstNode);
        myLinkedList.printmyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
////pop method used to delete 1st node
    @Test
    void given1stElementWhenDeleteShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.pop(myFirstNode);
        myLinkedList.printmyNodes();
        boolean result=myLinkedList.head.equals(mySecondNode)&&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
///deleting the last element to return tail as the second element
    @Test
    public void given3Numbers_pop_FirstNumber_ShouldBeDelete_From_Last() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printmyNodes();
        myLinkedList.popLast(myFirstNode);
        myLinkedList.printmyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
  ////search second node which is 30 in the linked list
    @Test
    public void given3Numbers_searchNumber_ShouldBeFound() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printmyNodes();
        INode foundNode = myLinkedList.searchNode(mySecondNode);

        boolean result = foundNode.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}
