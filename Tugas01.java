import java.util.Scanner;
class Tugas01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input 5 Bilangan ---> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        if (a % 2 == 1 && b % 2 == 1 && c == 2 % 1 && d == 2 % 1 && e == 2 % 1){
            System.out.println("1 bilangan ganjil");
        }
    }
}