package mahasiswa;

public class Mhs{
    private String nama;
    private String nim;
    private Int smt;

    public Mhs(String nama, String nim, Int smt){
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
    }
    public Mhs(){
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return this.nim;
    }

    public void setSmt(Int smt){
        this.smt = smt;
    }

    public Int getSmt(){
        return this.smt;
    }

}
