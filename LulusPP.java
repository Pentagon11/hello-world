import java.util.Scanner;
class LulusPP{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Kehadiran
        System.out.print("Masukkan jumlah kehadiran ---> ");
        int kehadiran = input.nextInt();
        double jumlahKehadiran = (kehadiran/16.0)*100.0;

        //Praktikum
        System.out.println("Ketik true bila ikut praktikum, dan false bila tidak mengikuti");
        boolean praktikum = input.nextBoolean();
        

        //Nilai
        System.out.print("Masukkan nilai Tugas ---> ");
        int nTugas = input.nextInt();

        System.out.print("Masukkan nilai Quiz ---> ");
        int nQuiz = input.nextInt();

        System.out.print("Masukkan nilai Mid ---> ");
        int nMid = input.nextInt();

        System.out.print("Masukkan nilai Final ---> ");
        int nFinal = input.nextInt();

        double totalNilai = (nTugas * 0.2 + nQuiz * 0.25 + nMid * 0.25 + nFinal * 0.30);

        if (jumlahKehadiran < 80 && praktikum == true && totalNilai >= 45){
            System.out.println("---------------------------");
            System.out.println("Jumlah kehadiran anda = " +jumlahKehadiran +"%");
            System.out.println("Mengikuti Praktikum = " +praktikum);
            System.out.println("Total Nilai = " +totalNilai);
            System.out.println("Anda dinyatakan LULUS");
        }else{
            System.out.println("---------------------------");
            System.out.println("Jumlah kehadiran anda = " +jumlahKehadiran +"%");
            System.out.println("Mengikuti Praktikum = " +praktikum);
            System.out.println("Total Nilai = " +totalNilai);
            System.out.println("Anda dinyatakan TIDAK LULUS");
        }

    }
}