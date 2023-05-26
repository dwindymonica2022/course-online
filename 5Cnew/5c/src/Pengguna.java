public class Pengguna {
    public int id;
    public String nama;
    public String email;

    public Pengguna ( int id, String nama, String email){
        this.id = id;
        this.nama = nama;
        this.email = email;
    }

    public void infoPengguna(){
        System.out.printf("id: "+id, " nama: "+nama, " email: "+email);
    }
}


