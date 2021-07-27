package Assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list= new SList<>();
        SListIterator<Integer> iterator = list.iterator();

        iterator.addNode(23);
        iterator.addNode(2);
        iterator.addNode(13);
        iterator.removeNode(1);
        iterator.addNode(29);
        iterator.removeNode(0);

        System.out.println(list.toString());
    }
}
