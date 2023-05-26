import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Peserta p10 = inputPeserta();
    }

    public static Peserta inputPeserta() {
        Scanner input =  new Scanner(System.in);

        System.out.println("Tambah peserta");
        System.out.println("id :");    
        Integer id = input.nextInt();
    
        System.out.println("Nama :");
        String nama = input.nextLine();
    
        System.out.println("email: ");
        String email = input.nextLine();
        
        System.out.println("alamat: " );
        String alamat = input.nextLine();
    
        System.out.println("no hp: ");
        String no_hp = input.nextLine();
        
        System.out.println("kelamin");
        char kelamin = input.nextLine().charAt(0);;

        input.close();
        
        Peserta p = new Peserta(id, nama, email, alamat, no_hp, kelamin);
        return p;  
    }

    
}
