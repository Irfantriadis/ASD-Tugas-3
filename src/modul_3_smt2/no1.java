package modul_3_smt2;
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        System.out.println("**** SEQUENTIAL SEARCH ****"+"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Irfan Triadi Saputra", "Tesla"};//isi aray
        String input;
 
        //menampilkan data aray
        System.out.print("isi data adalah: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        input = scan.nextLine(); //nilai yang dicari
        System.out.println("\n");
        
        for (int i = 0; i <= data.length; i++){
            if (input.equalsIgnoreCase(data[i])) {
                System.out.print("Data "+input+" berada pada index ke-" +i);
                break;
            }
        }
        System.out.println("\n");
    }
    
}
