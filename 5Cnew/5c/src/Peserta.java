public class Peserta extends Pengguna {

    private String alamat;
    private String no_hp;
    private char kelamin; 

    public Peserta(int i, String nama, String email, String alamat, String no_hp, char c) {
        super(i, nama, email);
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.kelamin = c;
    }

    public int getId() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo() {
        return no_hp;
    }

    public void setNo(String no_hp) {
        this.no_hp = no_hp;
    }

    public char getKelamin(){
        return kelamin;
    }

    public void setKelamin(char kelamin){
        this.kelamin = kelamin;
    }

    public void infopeserta(){
        String leftAlignFormat = "| %-4d | %-20s | %-20s | %-20s | %-15s | %-7s |%n";


        System.out.format(leftAlignFormat, id, nama, email, getAlamat(), getNo(), getKelamin());
    }
}
