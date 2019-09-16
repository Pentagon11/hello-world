import java.util.Scanner;
class Kalkulator{
    public static void main(String[] args){
        System.out.println("Selamat Datang di Kalkulator Otomatis");
    //input
        Scanner input = new Scanner(System.in);
        System.out.print("Massukkan Angka Pertama -----> ");
        double a = input.nextDouble();
        System.out.print("Massukkan Angka Kedua -------> ");
        double b = input.nextDouble(); 
    //rumus
        double tambah = a+b;
        double kurang = a-b;
        double kali = a*b;
        double bagi = a/b;
        double pangkat = Math.pow(a, b);
    //hasil
        System.out.println(" ");
        System.out.println("Hasil Penjumlahannya : " +tambah);
        System.out.println("Hasil Pengurangannya : " +kurang);
        System.out.println("Hasil Perkaliannya   : " +kali);
        System.out.printf("Hasil Pembagiannya   : %.2f " , bagi);
        System.out.println();
        System.out.printf("Hasil Pemangkatannya : %.2f " , pangkat);
        input.close();       


    }
}