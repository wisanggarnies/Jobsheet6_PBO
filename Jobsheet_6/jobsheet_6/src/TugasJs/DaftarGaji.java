package TugasJs;

public class DaftarGaji {
    public Pegawai[] listPegawai;

    DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai (Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i]== null) {
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemua() {
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println("Nama : " + listPegawai[i].nama);
            System.out.println("Nip : " + listPegawai[i].nip);
            System.out.println("Alamat : " + listPegawai[i].alamat);
            System.out.println("Gaji : " + listPegawai[i].getGaji());
        }
    }
}
