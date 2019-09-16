import java.util.Scanner;
class Lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai x ---> ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y ---> ");
        int y = input.nextInt();
        int r = 5;
        double s = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
        
        if (s > r){
            System.out.println("Titik diluar Lingkaran");
        }else if(s == r){
            System.out.println("Titik pada Lingkaran");
        }else{
            System.out.println("Titik diluar Lingkaran");
        }
        input.close();
    }
}