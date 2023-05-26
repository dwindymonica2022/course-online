public class Pengajar extends Pengguna{

    private String alamat;
    private String no_hp;
    private char kelamin; 

    public Pengajar(int id, String nama, String email, String alamat, String no_hp, char kelamin) {
        super(id, nama, email);
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.kelamin = kelamin;
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
        System.out.println("id: " + id + " nama: " + nama + " email: " + email + " alamat: " + getAlamat() + " No. Hp: " + getNo() + " kelamin: " + getKelamin());
    }    
    
}
