import java.util.*;
/*
Реализовать вложенные структуры данных (на верхнем уровне класс, на среднем - категория и на нижнем - элементы типа String)
с возможностью добавления, удаления и изменения их категорий и элементов.
Варианты:
2. LinkedList<PriorityQueue>
 */

public class Main {

    public static void main(String[] args) {
        int setSize = 0;
        String tempS, tempI;
        Scanner scanner = new Scanner(System.in);
        LinkedList<PriorityQueue<String>> setList = new LinkedList<>();
        System.out.println("Enter the number of list: ");
        setSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Add list");
        while (setSize != 0) {
            setList.add(QueueList.createQueue());
            setSize--;
        }
        System.out.printf("Linked list: %s\n",setList);
        System.out.println("Select number of queue for delete element");
        PriorityQueue<String> tempQueue;
        tempS = scanner.nextLine();
        tempQueue = setList.get(Integer.parseInt(tempS)-1);
        tempQueue.poll();
        System.out.printf("Linked list: %s\n",setList);
        System.out.println("Select number of queue for add element");
        tempS = scanner.nextLine();
        System.out.println("Enter element:");
        tempI = scanner.nextLine();
        System.out.printf("Add, %s \n",tempI);
        tempQueue.add(tempI);
        setList.set(Integer.parseInt(tempS)-1,tempQueue);
        System.out.printf("Linked list: %s\n",setList);
    }
}
class QueueList  {
    private static PriorityQueue<String> queue;
    private static int index;
    static String s ;
    public static  PriorityQueue<String> createQueue(){
        queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of queue: ");
        while (true){
            s = sc.nextLine();
            if("end".equals(s))
                break;
            queue.add(s);
        }
        System.out.println("Filling end");
        return queue;
    }


}
