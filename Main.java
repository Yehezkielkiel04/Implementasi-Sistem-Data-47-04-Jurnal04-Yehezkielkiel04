import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Lihat List Tugas Terurut");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nInput Data Tugas");
                    System.out.print("Mata Kuliah: ");
                    String mataKuliah = scanner.nextLine();
                    System.out.print("Tugas: ");
                    String tugas = scanner.nextLine();
                    System.out.print("Deadline: ");
                    String deadline = scanner.nextLine();
                    list.addFirst(new Tugas(mataKuliah, tugas, deadline));
                    break;
                case 2:
                    System.out.println("\nHapus Data Tugas");
                    System.out.println("1. Hapus Tugas di Awal");
                    System.out.println("2. Hapus Tugas di Akhir");
                    System.out.println("3. Hapus Tugas by Mata Kuliah");
                    System.out.println("4. Hapus Tugas by Nama Tugas");
                    System.out.print("Pilihan: ");
                    int deleteChoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    switch (deleteChoice) {
                        case 1:
                            list.deleteFirst();
                            break;
                        case 2:
                            list.deleteLast();
                            break;
                        case 3:
                            System.out.print("Masukkan Mata Kuliah: ");
                            String mk = scanner.nextLine();
                            list.deleteByMataKuliah(mk);
                            break;
                        case 4:
                            System.out.print("Masukkan Nama Tugas: ");
                            String nt = scanner.nextLine();
                            list.deleteByNamaTugas(nt);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nList Tugas:");
                    list.printList(true);
                    break;
                case 4:
                    System.out.println("\nList Tugas Terurut:");
                    list.sortByDeadline();
                    list.printList(true);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
