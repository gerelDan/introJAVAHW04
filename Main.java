import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        removeOddLengthStrings(ll);
        System.out.println(ll);
        MyStack ms = new MyStack();
        ms.push("asdfas");
        ms.push("sdafasfd");
        System.out.println(ms);
        System.out.println(ms.peek());
        System.out.println(ms);
        System.out.println(ms.pop());
        System.out.println(ms);
        ms.pop();
        String value = "apple";
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");

        ListUtils ls = new ListUtils();
        System.out.println(list);
        System.out.println(ls.countOccurrences(list, value));
    }

/*
Задание 1. Удаление нечетных строк
Дан LinkedList с несколькими элементами. В методе
removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */
    public static void removeOddLengthStrings(LinkedList<String> list){
        list.removeIf(n -> (n.length() % 2 != 0));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.removeIf())
//        }
    }

}