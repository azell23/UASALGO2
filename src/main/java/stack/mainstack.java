package stack;
public class mainstack {
    public static void main(String[] args) {
        stackApp newStack = new stackApp(10);
        newStack.push(1);
        newStack.show();
        newStack.push(2);
        newStack.show();
        newStack.push(3);
        newStack.show();
        System.out.println("Nilai teratas = "+newStack.peek());
        System.out.println("Nama saya adalah Hildan Rizky Ramadhan");
        System.out.println("Nilai yang dihapus adalah = "+newStack.pop());
        newStack.show();
        newStack.push(4);
        newStack.show();
    }
}