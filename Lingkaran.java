import java.util.Scanner;
class Lingkaran{
    public static void main(String[] args) {
        System.out.println("Masukan Jari-Jari Lingkaran");
        Scanner input = new Scanner(System.in);
        double jari = input.nextDouble();
        double luas = Math.PI*Math.pow(jari, 2);
        double keliling = 2*Math.PI*jari;
    System.out.println("Luasnya adalah : " +luas);
    System.out.println("Kelilingnya adalah : " +keliling);
    System.out.printf("%.2f\n", luas);
    System.out.printf("%.2f\n", keliling);
    input.close();
    }
}