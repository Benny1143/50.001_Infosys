package Problem_Set2B;

import java.util.*;

public class StackImpl<T> implements CustomStack<T>{
    public static void main(String[] args) {
        CustomStack<Integer> integerStack = new StackImpl<Integer>();
        System.out.println(integerStack.isEmpty()); //true
        System.out.println(integerStack.size()); // 0
        System.out.println(integerStack.peek()); // null
        System.out.println(integerStack.pop()); // null

        integerStack.push(10);
        integerStack.push(21);
        integerStack.push(63);
        integerStack.push(54);

        System.out.println(integerStack.isEmpty()); //false
        System.out.println(integerStack.size()); // 4
        System.out.println(integerStack.peek()); // 54
        System.out.println(integerStack.pop()); // 54
        System.out.println(integerStack.size()); // 3
    }

    private List<T> myList;
    StackImpl() {
        myList = new ArrayList<T>();
    }
    public void push(T o) {
        myList.add(o);
    }

    public T pop() {
        if(!isEmpty()){
            T a = myList.get(size()-1);
            myList.remove(size()-1);
            return a;
        } else {
            return null;
        }
    }

    public int size() {
        return myList.size();
    }

    public T peek() {
        return isEmpty() ? null : myList.get(size()-1);
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }
}
interface CustomStack<T> {
    void push(T t);
    T pop();
    int size();
    T peek();
    boolean isEmpty();
}

