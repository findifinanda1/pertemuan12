import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("21212203", "Dirga", "4O", 3.6);
        Mahasiswa12 mhs2 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs3 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs4 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs1);
        sll.addLast(mhs4);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(1, mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
}