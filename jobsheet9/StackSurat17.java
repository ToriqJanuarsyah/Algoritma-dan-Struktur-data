package jobsheet9;

public class StackSurat17 {
    Surat17[] tumpukan;
    int size, top;

    public StackSurat17(int size) {
        this.size = size;
        tumpukan = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == size - 1; }

    public void push(Surat17 s) {
        if (!isFull()) {
            tumpukan[++top] = s;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            return tumpukan[top--];
        }
        return null;
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        }
        return null;
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat Ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + tumpukan[i].idSurat + " | Jenis: " + tumpukan[i].jenisIzin);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
    }
}
