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
        for (String s : ll) {
            System.out.println(s);
        }
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