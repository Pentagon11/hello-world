import java.util.Scanner;
class Latihan4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai x ---> ");
        int x = input.nextInt();
        System.out.print("Masukkan Nilai y --->");
        int y = input.nextInt();

        if ((x % y) ==0){
            System.out.println(x+ " Adalah Kelipatan " +y);
        }
    }
}