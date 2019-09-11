import java.util.Scanner;
class Kelulusan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Identitas
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.next();

        //Kehadiran
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.print("Masukkan jumlah kehadiran ---> ");
        int kehadiran = input.nextInt();
        double jumlahKehadiran = (kehadiran / 16.0) * 100.0;

        //Praktikum
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.println("Ketik true jika mengikuti praktikum dan ");
        System.out.print("false jika tidak mengikuti ---> ");
        boolean praktikum = input.nextBoolean();

        //Nilai
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        System.out.print("Masukkan nilai Tugas ---> ");
        int nTugas = input.nextInt();
        System.out.print("Masukkan nilai Quiz ---> ");
        int nQuiz = input.nextInt();
        System.out.print("Masukkan nilai Mid ---> ");
        int nMid = input.nextInt();
        System.out.print("Masukkan nilai Final ---> ");
        int nFinal = input.nextInt();
        double nilaiTotal = (nTugas * 0.2 + nQuiz * 0.25 + nMid * 0.25 + nFinal * 0.30);

        //Syarat
        if (jumlahKehadiran >= 80 && praktikum == true && nilaiTotal >= 45){
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
            System.out.println("Nama                 : " +nama);
            System.out.println("NIM                  : " +nim);
            System.out.println("Persentase Kehadiran : " +jumlahKehadiran + " %");
            System.out.println("Mengikuti Praktikum  : " +praktikum);
            System.out.println("Total Nilai          : " +nilaiTotal);
            System.out.println("-------> Anda dinyatakan LULUS matakuliah ini <-------");
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        }else{
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
            System.out.println("Nama                 : " +nama);
            System.out.println("NIM                  : " +nim);
            System.out.println("Persentase Kehadiran : " +jumlahKehadiran + " %");
            System.out.println("Mengikuti Praktikum  : " +praktikum);
            System.out.println("Total Nilai          : " +nilaiTotal);
            System.out.println("----> Anda dinyatakan TIDAK LULUS matakuliah ini <----");
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
        }
        input.close();
    }
}