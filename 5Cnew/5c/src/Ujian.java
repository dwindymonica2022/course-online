public class Ujian extends Course {
    private int jumlahSoal;
    private int waktuMnt;
    private String jenisSoal;

    public Ujian (String mapel, int jumlahSoal, int waktuMnt, String jenisSoal) {
        super(mapel);
        this.jumlahSoal = jumlahSoal;
        this.waktuMnt = waktuMnt;
        this.jenisSoal = jenisSoal;
    }
    public String getMapel(){
        return mapel;
    }
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public int getJumlahSoal() { return jumlahSoal; }
    public void setJumlahSoal(int jumlahSoal) { this.jumlahSoal = jumlahSoal; }

    public int getWaktuMnt() { return waktuMnt; }
    public void setWaktuMnt(int waktuMnt) { this.waktuMnt = waktuMnt; }

    public String getJenisSoal() { return jenisSoal; }
    public void setJenisSoal(String jenisSoal) { this.jenisSoal = jenisSoal; }

    public void infoMapel() {
        System.out.println("Mata pelajaran: " + mapel + "Jumlah Soal: " + getJumlahSoal() + "Waktu (dlm menit): " + getWaktuMnt() + "Jenis Soal: " + getJenisSoal());
    }
}
