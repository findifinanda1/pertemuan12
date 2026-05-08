import java.util.Scanner;

public class MainAntrean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian q = new QueueAntrian();
        int pilihan;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Panggil Antrean");
            System.out.println("3. Tampilkan Antrean Depan & Belakang");
            System.out.println("4. Cek Jumlah Mahasiswa di Antrean");
            System.out.println("5. Kosongkan Antrean");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    q.enqueue(new MahasiswaAntri(nim, nama));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.cekJumlah();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilihan != 6);
        
        System.out.println("Program selesai.");
    }
}