package if1.pkg10119030.latihan28.gantikata;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini dibuat untuk mengganti kata dalam kalimat.
*/
public class GantiKata {
    static Scanner scan = new Scanner(System.in);
    String Kalimat, gantiKata, menjadiKata;
    
    private void masukkanKalimat(){
        System.out.print("Masukkan kalimat :");
        Kalimat = scan.nextLine();
        System.out.print("Ganti kata : ");
        gantiKata = scan.nextLine();
        System.out.print("Menjadi kata : ");
        menjadiKata = scan.next();
    }
    
    private String mengubahKalimat(){
        return Kalimat.replaceAll(gantiKata,menjadiKata);
    }
    private void tampilKalimat(String hasil){
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : ".concat(Kalimat));
        System.out.println("Kalimat baru : ".concat(hasil));
    }
    
    public static void main(String[] args) {
        GantiKata data = new GantiKata();
        data.masukkanKalimat();
        String hasil = data.mengubahKalimat();
        data.tampilKalimat(hasil);
        System.out.println("(Developed by ; Rendy Dermawan)");
       
    }
    
}
