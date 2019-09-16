import java.util.Scanner;
class Luaslingkaran{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jari = sc.nextDouble();
        double luas = Math.PI*Math.pow(jari, 2);
        double keliling = 2*Math.PI*jari;
        System.out.println("Luasnya adalah : " +luas);
        System.out.println("Luasnya adalah : " +keliling);
        System.out.printf("%.2f\n",luas);
        System.out.printf("%.2f\n",keliling);
        sc.close();
    }
}