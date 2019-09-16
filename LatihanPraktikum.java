import java.util.Scanner;
class LatihanPraktikum{
    public static void main(String[] args){
       System.out.println("------ Luas Segitiga ------");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Alas ----->");
        double alas = input.nextDouble();
        System.out.print("Masukkan Panjang Tinggi --->");
        double tinggi = input.nextDouble();
        double luas = alas * tinggi / 2.0;
        System.out.printf("Luas Segitiga : %.2f" , luas);
        System.out.println(" Meter");
    input.close();
    }
}   