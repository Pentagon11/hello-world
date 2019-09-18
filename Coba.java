import java.util.Scanner;
class Coba{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("----- Menghitung Luas Lingkaran -----");
        System.out.print("Masukkan Panjang Jari-Jari Lingkaran --->");
        double jari = input.nextDouble();
        double luasLingkaran = Math.PI * Math.pow(jari, 2);
        System.out.println("Luas Lingkarannya Adalah : " +luasLingkaran); 
    }
}