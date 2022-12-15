import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        /*  
         *  stack merupakan struktur data yang bersifat LIFO (Last In First Out)
         *  artinya, data yang terakhir dimasukkan akan menjadi data yang pertama keluar
        */
        
        Stack<Character> stek = new Stack<Character>(); // memanggil class Stack di java untuk membuat struktur data stack
        stek.push('S'); // data pertama yang dimasukkan
        stek.push('A');
        stek.push('T');
        stek.push('U');
        stek.push(' ');
        stek.push('D');
        stek.push('U');
        stek.push('A'); // data terakhir yang dimasukkan

        /*  
         *  jika melakukan pengambilan data dari stek, 
         *  maka data paling atas atau yang paling terakhir 
         *  dimasukkan akan menjadi yang pertama keluar 
        */

        System.out.println(stek);
        // contoh pengambilan data dari stek
        System.out.println(stek.pop());  // data pertama yang tampil adalah data yang terakhir dimasukkan
        System.out.println(stek.pop());
        System.out.println(stek.pop());
        
        System.out.println(stek);
    }
}