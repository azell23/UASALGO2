package queue;
public class queApp {
    public static void main(String[] args) {
        mainque antrian = new mainque(10);
        antrian.enqueue(1);
        antrian.tampil();
        antrian.enqueue(8);
        antrian.tampil();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama saya adalah Hildan Rizky Ramadhan");
        antrian.tampil();
        antrian.enqueue(7);
        antrian.tampil();
        antrian.enqueue(6);
        antrian.tampil();
        System.out.println("nilai yang paling depan = " + antrian.peek());
   }
}