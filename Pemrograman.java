import java.util.Scanner;

class Pemrograman{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Alas");
    int alas = input.nextInt();
    System.out.println("Masukan Tinggi");
    int tinggi = input.nextInt();
    int luas=alas*tinggi/2;
    System.out.println("1. Luas Segitiga : " +luas);
    input.close();
    }
}  