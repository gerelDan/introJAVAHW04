import java.util.LinkedList;

/*
Задача 2. Реализация стека
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
 */
public class MyStack {

    private LinkedList<String> myStack = new LinkedList<>();

    public void push(String e){
        this.myStack.add(e);
    }
    private boolean isEmpty(){
        return this.myStack.isEmpty();
    }
    public String peek(){
        return this.myStack.getLast();
    }
    public String pop(){
        if (this.myStack.isEmpty()) throw new RuntimeException("Stack is empty"); //return null;
        String res = this.myStack.peek();
        this.myStack.remove(myStack.size()-1);
        return res;
    }
    public LinkedList<String> getElements(){
        return this.myStack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (String s : this.myStack) {
            sb.append(s);
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public int getSize() {
        return this.myStack.size();
    }
}
