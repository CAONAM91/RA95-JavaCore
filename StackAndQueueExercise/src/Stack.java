public class Stack {

    static final int MAXSIZE =4 ;
    int top;
    String stack[] = new String[MAXSIZE]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    public Stack() {
        top = -1;
    }

    public boolean isFull() {
        if (top == MAXSIZE - 1)
            return true;
        else
            return false;
    }

    public boolean push(String item) {
        if (isFull()) {
            System.out.println("Khong the them phan tu");
            return false;
        } else {
            stack[++top] = item;
            return true;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Mang rong, ko co phan tu");
            return null;
        }
    }

    public StringBuilder print() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb;
    }

}






