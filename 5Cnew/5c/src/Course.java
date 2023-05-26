import java.util.ArrayList;

public class Course {
    public String mapel;

    public ArrayList<Peserta> daftarPeserta = new ArrayList<>();

    public Course (String mapel) {
        this.mapel = mapel;
    }

    public void tambahPeserta(Peserta p){
        daftarPeserta.add(p);
    }

    public void cetakSeluruhPeserta(Peserta p) {
        System.out.println("\nDaftar Seluruh Peserta");
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
        System.out.format("| ID   | NAMA                 | EMAIL                | ALAMAT               | NO.HP           | KELAMIN |%n");
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
        for (Peserta z : daftarPeserta){
            z.infopeserta();
        }
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
    }

    public void hapusPeserta(Peserta p) {
        daftarPeserta.remove(p);
    }

    public void infoCourse(){
        System.out.println("Anggota course");
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
        System.out.format("| ID   | NAMA                 | EMAIL                | ALAMAT               | NO.HP           | KELAMIN |%n");
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
        for(Peserta p : daftarPeserta){
            p.infopeserta();
        }
        System.out.format("+------+----------------------+----------------------+----------------------+-----------------+---------+%n");
    }

    public Peserta cariPesertaByKode(int id) {
        for(Peserta p : daftarPeserta) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
