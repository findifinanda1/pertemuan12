public class QueueAntrian {
    Node head, tail;
    int size;

    class Node {
        MahasiswaAntri data;
        Node next;

        Node(MahasiswaAntri data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(MahasiswaAntri data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(data.nama + " telah didaftarkan ke antrean.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada yang dipanggil.");
        } else {
            System.out.println("Memanggil antrean: " + head.data.nama + " (" + head.data.nim + ")");
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: " + head.data.nama);
            System.out.println("Mahasiswa paling akhir: " + tail.data.nama);
        } else {
            System.out.println("Antrean sedang kosong.");
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Semua antrean telah dikosongkan.");
    }

    public void cekJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrean saat ini: " + size);
    }
}