# JOBSHEET 12 FUNGSI 2

### NAMA : FADILA MAYAMASITA

### NIM : 254107020012

### KELAS : 1C_TI

### Percobaan 1 : 

1. Apa yang dimaksud dengan fungsi rekursif?

   Jawaban :

   Fungsi rekursif adalah fungsi yang memanggi dirinya sendiri untuk menyelesaikan masalah dengan membagi masalah tersebut dengan sub masalah yang lebih kecil.

2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

   Jawaban :

   Ya, kedua fungsi tersebut memberikan hasil yang sama, karena keduanya menghitung nilai faktorial dari angka yang dimasukkan. Misalnya untuk input nilai 5, baik fungsi rekursif maupun iteratif akan menghasilkan nilai 120.Perbedaannya terletak pada cara kerja masing-masing fungsi. Pada fungsi rekursif, proses perhitungan dilakukan dengan memanggil kembali fungsi yang sama secara berulang sampai mencapai nilai dasar, yaitu ketika n bernilai 0. Setiap pemanggilan disimpan di dalam stack, sehingga alurnya berjalan dari pemanggilan yang paling atas, lalu hasilnya dihitung kembali satu per satu saat fungsi mulai kembali (return). Sementara itu, fungsi iteratif menggunakan perulangan biasa (loop) untuk menghitung faktorial. Nilai faktorial diperoleh dengan mengalikan angka dari 1 hingga n secara bertahap dalam satu blok perulangan tanpa melakukan pemanggilan fungsi berulang. Cara iteratif cenderung lebih efisien karena tidak memerlukan banyak memori dan tidak berisiko menimbulkan stack overflow.

### Percoban 2 :

1.  Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

   Jawaban : 

   Pemanggilan fungsi rekursif pada program tersebut akan terus berlangsung selama nilai pangkat yang diberikan masih lebih besar dari nol. Setiap kali fungsi dipanggil, nilai pangkat akan dikurangi satu hingga akhirnya mencapai nilai 0. Pada saat nilai pangkat sudah menjadi 0, fungsi tidak lagi memanggil dirinya sendiri dan langsung mengembalikan nilai 1 sebagai tanda bahwa proses rekursi telah selesai. Dengan kata lain, rangkaian pemanggilan fungsi hanya berlangsung sampai kondisi dasar ini terpenuhi, dan setelah itu program mulai menghitung kembali hasil dari setiap pemanggilan sebelumnya hingga menghasilkan nilai akhir.

2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

   Jawaban :
```
import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(x + " x ");
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();

        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        
        System.out.print("Deret: ");
        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println(" = " + hasil);
    }
}
```
Outputnya : 

<img width="355" height="75" alt="Screenshot 2025-12-02 121654" src="https://github.com/user-attachments/assets/7742085f-b634-492d-8b11-05cd622534ff" />

### Percobaan 3 : 

1.  Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

   Jawaban : 

A. Base case = if (tahun == 0) return saldo; (menghentikan rekursi)

B. Recursion call = 	return 1.11 * hitungLaba(saldo, tahun - 1);	(Memanggil fungsi secara rekursif)

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)

   Jawaban :
```
public class TracePercobaan3 {

    static double hitungLaba(double saldo, int tahun) {
        System.out.println("Memanggil hitungLaba(" + saldo + ", " + tahun + ")");

        if (tahun == 0) {
            System.out.println("Base case tercapai: return " + saldo);
            return saldo;
        } else {
            System.out.println("Ekspansi: 1.11 * hitungLaba(" + saldo + ", " + (tahun - 1) + ")");
            double hasil = 1.11 * hitungLaba(saldo, tahun - 1);
            System.out.println("Substitusi: hitungLaba(" + saldo + ", " + tahun + ") = " + hasil);
            return hasil;
        }
    }

    public static void main(String[] args) {
        double saldo = 100000;
        int tahun = 3;

        System.out.println("=== TRACE PERHITUNGAN LABA ===");
        double hasilAkhir = hitungLaba(saldo, tahun);

        System.out.println("\nHasil akhir: " + hasilAkhir);
    }
}
```
Outputnya : 

<img width="566" height="309" alt="Screenshot 2025-12-02 132314" src="https://github.com/user-attachments/assets/3606f5a1-b7f0-46b5-96dc-21a3ac1921a6" />

### TUGAS : 

1. Buatlah program yang mengimplementasikan fungsi rekursif dan fungsi iteratif untuk menghitung dan mencetak total nilai, dengan input N → 1 + 2 + 3 + 4 + 5 + … + … + N. Contoh:

<img width="709" height="173" alt="image" src="https://github.com/user-attachments/assets/a3b31dd2-e24f-4616-a99d-a4bc6726227b" />

Jawaban :
```
import java.util.Scanner;

public class TotalAngka {
    static int totalRekursif(int n) {
        if (n == 0) {
            return 0; // base case
        } else {
            return n + totalRekursif(n - 1); // rekursi
        }
    }
    static int totalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        System.out.println();

        
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int dummy = sc.nextInt(); 
        }

        System.out.println();

        int hasilRekursif = totalRekursif(N);

        int hasilIteratif = totalIteratif(N);

        System.out.println("Total dari " + N + " angka (rekursif) adalah: " + hasilRekursif);
        System.out.println("Total dari " + N + " angka (iteratif) adalah: " + hasilIteratif);
    }
}
```
Outputnya :

<img width="465" height="377" alt="Screenshot 2025-12-02 133133" src="https://github.com/user-attachments/assets/14092085-e1b2-4016-9a81-d9e3f376ff4d" />




   

   


   
