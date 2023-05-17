import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new Mhs("username", "password");

        mhs.setNama("Renvil Imawan");
        mhs.setNim("G.111.20.0032");
        mhs.setSmt(6);

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());

        User mahsiswa = new User("renvil.imawan", "qwerty");
    
    System.out.println("Username :" + mahsiswa.getUsername());
    System.out.println("Password :" + mahsiswa.getPassword());
    }
}