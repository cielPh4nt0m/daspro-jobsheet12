
 public class Percobaan1 {
    static int faktorRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorRekursif(n - 1));
        }
    }
    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
 }