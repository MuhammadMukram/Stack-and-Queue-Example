import java.util.*;

public class Queueexample {
    public static void main(String[] args) {
        /* 
         *   queue merupakan struktur data yang bersifat FIFO (First In First Out)
         *   artinya, data yang pertama dimasukkan akan menjadi data yang pertama keluar
        */
        Queue<String> MusicQueue = new LinkedList<String>(); // memanggil class Queue di java untuk membuat struktur data queue

        MusicQueue.add("Evaluasi"); // data pertama yang dimasukkan 
        MusicQueue.add("Sempurna");
        MusicQueue.add("Andai");
        MusicQueue.add("Sudah");
        MusicQueue.add("Dan"); // data terakhir yang dimasukkan

        /*  
         *  jika melakukan pengambilan data dari queue, 
         *  maka data yang paling pertama dimasukkan 
         *  akan menjadi yang pertama keluar 
        */

        System.out.println(MusicQueue);
        // contoh pengambilan data dari queue
        System.out.println(MusicQueue.remove()); // data pertama yang tampil adalah data yang pertama kali dimasukkan
        System.out.println(MusicQueue.remove());
        System.out.println(MusicQueue.remove());
        
    }
}