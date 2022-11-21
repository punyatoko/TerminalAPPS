import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n=====================================");
        System.out.println("   SELAMAT DATANG DI PUNYA TOKO APPS   ");
        System.out.println("=====================================");
        System.out.print("\nSilahkan pilih apakah anda Penjual atau Pembeli: ");
        String pilihanUser = scan.nextLine();

        switch (pilihanUser.toUpperCase()) {
            case "PENJUAL":
            penjual();
                break;
            case "PEMBELI":
            pembeli();
                break;
            default:
            System.out.println("Pilihan Tidak Ada");
                break;
        }
    }

    // Function for penjual
    public static void penjual(){
        System.out.println("Kamu penjual");
    }

    // Function for pembeli
    public static void pembeli(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n+++ ANDA MERUPAKAN PEMBELI +++");
        System.out.print("Silahkan inputkan nama anda: ");
        String namaPembeli = scan.nextLine();
        System.out.println("==========================");
        System.out.println("\nSELAMAT DATANG " + namaPembeli.toUpperCase());
        System.out.println("\n================");
        System.out.println("LIST PRODUK");
        System.out.println("================");

    }

}