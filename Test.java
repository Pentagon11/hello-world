import java.util.Scanner;
class Test{
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
            terbesar = x;
            terkecil = y;
            System.out.println("Angka terbesar : " +terbesar);
            System.out.println("Angka terkecil : " +terkecil);
        }else if (x < z){
           terbesar = z;
           terkecil = x; 
           System.out.println("Angka terbesar : " +terbesar);
           System.out.println("Angka terkecil : " +terkecil);
        }else if (z < y){
            terbesar = y;
            terkecil = z;
            System.out.println("Angka terbesar : " +terbesar);
            System.out.println("Angka terkecil : " +terkecil);
        input.close();
        }
    }
}