import java.util.Scanner;

public class nomor2 {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        String nilai_coding = "";
        String nilai_interview = "";
        System.out.print("Masukkan score coding : ");
        int n = in.nextInt();    
        
    if (n > 80) {
        nilai_coding = "LOLOS";
        nilai_interview = "A";
    }else if (n >= 60 & n <= 80) {
        nilai_coding = "DIPERTIMBANGKAN";
        nilai_interview = "B";
    }else if (n < 60) {
        nilai_interview = "GAGAL";
    }

    if (nilai_coding == "LOLOS" || nilai_coding == "DIPERTIMBANGKAN" &&
       (nilai_interview == "A" || nilai_interview == "B")) {
        System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    }else {
        System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }
  }
}