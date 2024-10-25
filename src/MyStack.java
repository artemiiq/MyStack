public class MyStack {
    private Object[] elements;
    private int size;

    public MyStack() {
        elements = new Object[10];
        size = 0;
    }

    // Метод додавання елемента в кінець
    public void push(Object value) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    // Метод видаляє елемент за індексом
    public void remove(int index) {
        if (index >= size || index < 0 ) {
            throw new IndexOutOfBoundsException("Індекс виходить за межі списку");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size--] = null;
    }

    // Метод очишає колекцію
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // Метод повертає розмір колекції
    public int size() {
        return size;
    }

    // Метод повертає перший елемент стеку
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Стек пустий");
        }
        return elements[size - 1];
    }

    // Метод овертає перший елемент стеку та видаляє його з колекції
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Стек пустий");
        }
        Object topElement = elements[--size];
        elements[size] = null;
        return topElement;
    }

    // Допоміжний метод для розширення масиву при переповненні
    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
