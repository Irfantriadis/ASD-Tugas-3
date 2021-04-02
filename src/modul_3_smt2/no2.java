package modul_3_smt2;
import java.util.Scanner;
public class no2 {
    public static void main(String[]args) {
        int B[]={2, 4, 6 ,8 ,10 ,12 ,14 ,16 ,18 ,20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        cari = scan.nextInt(); //nilai yang dicari
        System.out.println("\n");
        
        System.out.print("Isi data adalah");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir)&&(ketemu == 0)){
        point = (IndeksAwal + IndeksAkhir)/2;
        System.out.println("Indeks Pointer : "+point);
            if(cari == B[point]){
                ketemu = 1;
                System.out.println("Data " +
                cari + " Telah ditemukan pada index ke "+point);
            }
            
            else if(cari < B[point]){
                System.out.println("Cari di kiri ");
                IndeksAkhir = point -1;        
            }
            
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
                }
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan data ditemukan ");
        else
            System.out.println("Kesimpulan data tidak ditemukan ");
        }
    }