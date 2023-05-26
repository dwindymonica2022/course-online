public class Materi extends Course {
    private String judulMateri;
    private String isiKonten;

    public Materi (String mapel, String judulMateri, String isiKonten) {
        super(mapel);
        this.judulMateri = judulMateri;
        this.isiKonten = isiKonten;
    }
    public String getMapel(){
        return mapel;
    }
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getJudulMateri() { return judulMateri; }
    public void setJudulMateri(String judulMateri) { this.judulMateri = judulMateri; }

    public String getIsiKonten() { return isiKonten; }
    public void setIsiKonten(String isiKonten) { this.isiKonten = isiKonten; }

    public void infoMapel() {
        System.out.println("Mata pelajaran: " + mapel + "Judul Materi: " + getJudulMateri() + "Isi Konten: " + getIsiKonten());
    }
}
