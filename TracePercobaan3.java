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

