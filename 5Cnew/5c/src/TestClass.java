public class TestClass {
    public static void main(String[] args) {
        Course mtk = new Course("Matematika");

        Peserta p1 = new Peserta(001, "mahez", "mahez@rumail.com", "pringsewu", "089632172873", 'L');
        Peserta p2 = new Peserta(002, "mansur", "sedekah@gmail.com", "lampung", "08123", 'L');
        Peserta p3 = new Peserta(003, "Anginy", "angin@tmail.com", "balam", "23456788", 'P');
        mtk.tambahPeserta(p1);
        mtk.tambahPeserta(p2);
        mtk.infoCourse();

        Peserta mhapus = mtk.cariPesertaByKode(001);
        mtk.hapusPeserta(mhapus);
        mtk.infoCourse();

        // Peserta p4 = inputPeserta();
        // mtk.tambahPeserta(p4);
        // mtk.infoCourse();
    }

    // private static Peserta inputPeserta(){
    // Scanner input = new Scanner(System.in);
    // System.out.println("Masukkan Nama Siswa:" );
    // String nmasiswa = input.nextLine();
    // System.out.println("Kode peserta: ");
    // String kodeps = input.nextLine();
    // input.close();

    // Peserta p = new Peserta(nmasiswa, kodeps);
    // return p;

    // }

}