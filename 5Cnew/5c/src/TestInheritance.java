import java.util.ArrayList;

public class TestInheritance {
    public static void main(String[] args) {
        Peserta p = new Peserta(005, "Nana", "nanaas@gmail.com", "Lampung", "02823123", 'L');
        Pengajar a =  new Pengajar(007, "Ella", "elaala@gmail.com", "Lampung", "043217", 'P');
        Pengguna k = new Pengguna(004, "Budi", "awaahsh2@gmail.com");

        ArrayList<Pengguna> daftarPengguna = new ArrayList<>();
        daftarPengguna.add(k);
        daftarPengguna.add(p);
        daftarPengguna.add(a);

        Materi m = new Materi("IPA", "Mikroorganisme", "Membahas terkait mikroorganisme di bumi");
        Ujian u = new Ujian("IPS", 10, 120, "Pilihan Ganda");
        Course c = new Course("Kimia");

        ArrayList<Course> daftarCourse = new ArrayList<>();
        daftarCourse.add(m);
        daftarCourse.add(u);
        daftarCourse.add(c);
    }
}
