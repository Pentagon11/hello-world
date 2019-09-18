import java.util.Scanner;
class Latihan2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Angka ---> ");
        int angka = input.nextInt();

        if (angka % 1==0){
            System.out.print(angka +" Adalah Bilangan Ganjil");
            }else{
                System.out.println(angka +" Adalah Bilangan Genap"); 
                }if (angka >= 10 ){
                System.out.print(", Lebih Dari Sama Dengan 10");
                }else{
                System.out.println(", Kurang Dari 10");    
                }if (angka < 100){
                    System.out.println(", Kurang Dari 100");
                }else {
                    System.out.println(", Tidak Memenuhi");
                }
            }
        }
    
