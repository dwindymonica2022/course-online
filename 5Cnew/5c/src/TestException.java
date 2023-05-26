import java.util.InputMismatchException;
import java.util.Scanner;;

public class TestException {
    public static void main(String[] args) {
        Peserta p10 = inputPeserta();
    }

    private static Peserta inputPeserta() {
        Scanner input = new Scanner(System.in);

        System.out.println("Tambah peserta");
        System.out.println("id :");
        Integer id = 0;

        try {
            Integer z = input.nextInt();
        } catch (InputMismatchException x) {
            System.out.println("mohon masukkan Angka saja");
        }

        System.out.println(" ");
        String namas = input.nextLine();

        System.out.println("Nama :");
        String nama = input.nextLine();

        if (nama.matches(".*[0-9].*") == true) {
            System.exit(0);
        }

        System.out.println(" ");
        System.out.println("email: ");
        String email = input.nextLine();

        System.out.println(" ");
        System.out.println("alamat: ");
        String alamat = input.nextLine();

        System.out.println(" ");
        System.out.println("no hp: ");
        String no_hp = input.nextLine();

        System.out.println(" ");
        System.out.println("kelamin");
        char kelamin = input.nextLine().charAt(0);
        ;

        input.close();

        Peserta p = new Peserta(id, nama, email, alamat, no_hp, kelamin);
        p.infopeserta();
        return p;
    }

}
