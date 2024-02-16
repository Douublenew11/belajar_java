package Modul2.InputScanner;
import java.util.Scanner;

class InputScanner {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        
        System.out.print("Input NIM : ");
        String nim = inputKeyboard.nextLine();
        System.out.print("\n");
        
        System.out.print("Input Nama : ");
        String nama = inputKeyboard.nextLine();
        System.out.print("\n");
        
        System.out.print("Input Prodi : ");
        String prodi = inputKeyboard.nextLine();
        System.out.print("\n");
        
        
        System.out.print("Input Angkatan : ");
        int angkatan = inputKeyboard.nextInt();
        System.out.print("\n");
        
        System.out.print("Input IPK : ");
        double ipk = inputKeyboard.nextDouble();
        System.out.print("\n");
        
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("IPK : " + ipk);
     
    }
}
