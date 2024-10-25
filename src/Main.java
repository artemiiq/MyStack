public class Main {
    public static void main(String[] args) {
        MyStack list = new MyStack();

        list.push("GoIT courses");
        list.push("Hello");
        list.push("World");

        System.out.println("Size: " + list.size());

        System.out.println("Peek: " + list.peek());

        System.out.println("Pop: " + list.pop());
        System.out.println("Size after pop: " + list.size());

        list.remove(0);
        System.out.println("Size after remove: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}