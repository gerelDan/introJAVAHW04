import java.util.LinkedList;

/*
Задача 3. Количество вхождений слова
Реализуйте метод countOccurrences в классе ListUtils, который
принимает LinkedList<String> и строку, и возвращает количество
вхождений строки в список.

 */
public class ListUtils {
    public int countOccurrences(LinkedList<String> ll, String str){
        int res = 0;
//        ll.containsAll(str);
        for (String s : ll) {
            if(s.equals(str)) res++;
        }
        return res;
    }
}
