package Assignment10;

public class SList <T>{
    public Node<T> head;
    public int size;
    public SList(){
        head=null;
        size=0;
    }
    public SListIterator<T> iterator(){
        return new SListIterator<>(this);
    }

    public String toString(){
        String list ="";
        Node<T> currNode = head;
        while (currNode!=null){
            list=list+currNode.data+" ";
            currNode=currNode.next;
        }
        return list;
    }

}