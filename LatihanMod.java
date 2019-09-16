import java.util.Scanner;
class LatihanMod{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int hasil = a%b;
    a--;
    b++;
    System.out.println("Hasil : " +hasil);
    System.out.println(a);
    System.out.println(b);
    sc.close();
    }
}

