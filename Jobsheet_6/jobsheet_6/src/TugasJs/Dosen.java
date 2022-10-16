package TugasJs;

public class Dosen extends Pegawai{
    public int sks;
    public int tarifSks;

    Dosen(String nama, String nip, String alamat, int tarifSks) {
        super (nama, nip, alamat);
        this.tarifSks = tarifSks;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

    public int getGaji() {
        return sks * tarifSks;
    }
}
