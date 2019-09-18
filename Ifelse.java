import java.util.Scanner;
class Ifelse{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nilai Angka --->");
    int angka = input.nextInt();
    if (angka % 2==1){
        System.out.print(angka + " Adalah Bilangan Ganjil");
    }else{
        System.out.println(angka + " Adalah Bilangan Genap");
    }if (angka < 10){
        System.out.print(", Kurang Dari 10");
    }if (angka >= 100){
        System.out.print(", Lebih Dari / Sama Dengan 100");
    }else {
        System.out.println(", Diantara 10 Sampai 99");
    }
  }
}
