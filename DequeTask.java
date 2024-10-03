import java.util.Deque;

/*
Задача 4. Сдвиг очереди
Реализуйте метод rotateDeque в классе DequeTasks, который принимает
Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
позиций. Если n отрицательное, повернуть влево.
 */
public class DequeTask {
    public void rotateDeque(Deque<Integer> deq, int n){
        n = n % deq.size();
        if (n>0){
            for (int i = 0; i < n; i++) {
                deq.addLast(deq.removeFirst());
            }
        } else if (n<0) {
            for (int i = 0; i > n; i--) {
                deq.addFirst(deq.removeLast());
            }
        }
    }
    /*
    Реализуйте метод removeAllOccurrences в классе DequeTasks, который
принимает Deque<String> и строку value. Метод должен удалить все
вхождения строки value из очереди.
     */
    public void removeAllOccurrences(Deque<String> deque, String value){
        deque.removeIf(n -> (n.equals(value)));
    }
}
