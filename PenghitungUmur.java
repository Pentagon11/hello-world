import java.util.Scanner;
class PenghitungUmur{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(".....Selamat Datang Di Mesin Penghitung Umur.....");
    System.out.print("Masukkan Tahun Kelahiran Anda ----->");
    int tahunLahir = input.nextInt();
    int umur = 2019-tahunLahir;
    System.out.println(" ");
    System.out.println("Umur Anda : " +umur + " Tahun");
    input.close();
    }
}
