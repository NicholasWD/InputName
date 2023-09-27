package projectcodingan;
import java.util.Scanner;
public class ProjectCodingan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, ttl, umur, status;
        
        System.out.println("========== Data Diri ==========");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Tempat dan tanggal lahir :");
        ttl = input.nextLine();
        System.out.print("Umur: ");
        umur = input.nextLine();
        System.out.print("Status (mahasiswa atau sebagainya): ");
        status = input.nextLine();
        
        System.out.println("===============================");
        
        System.out.println("Perkenalkan nama saya " + nama + ".");
        System.out.println("Saya lahir di " + ttl + " dan saya berumur " + umur + ".");
        System.out.println("Saya adalah seorang " + status);
        
    }
    
}
