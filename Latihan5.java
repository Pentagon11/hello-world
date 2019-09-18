import java.util.Scanner;
class Latihan5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x ---> ");
        int x = input.nextInt();

        System.out.print("Masukkan nilai y ---> ");
        int y = input.nextInt();

        System.out.print("Masukkan nilai z ---> ");
        int z = input.nextInt();

        int terkecil, terbesar;

        if (x > y){
            terkecil = y;
            terbesar = x;
        }else{
            terkecil = x;
            terbesar = y;
        }
        if (terkecil > z){
            terkecil = z;
        }else if (z > terbesar){
            terbesar = z;
        }

        System.out.println("Terbesar = " +terbesar);
        System.out.println("Terkecil = " +terkecil);

        double sum = (terkecil + terbesar) / 2.0;
        System.out.printf("Rata-rata terkecil & terbesar = %.2f\n", sum);
    }
}