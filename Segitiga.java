import java.util.Scanner;
class Segitiga{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Alas Lingkaran --->" );
        double alas = input.nextDouble();
        System.out.print("Masukkan Tinggi Lingkaran --->" );
        double tinggi = input.nextDouble();
        double luas = alas*tinggi/2;
        double keliling = Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2));
        
        System.out.println("Luasnya Adalah : " +luas);
        System.out.printf("Kelilingnya Adalah : " +"%.2f", keliling);
        input.close();
    }
}