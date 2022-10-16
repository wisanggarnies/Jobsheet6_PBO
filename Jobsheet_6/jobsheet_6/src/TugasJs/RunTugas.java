package TugasJs;

public class RunTugas {
    public static void main (String [] args) {
        DaftarGaji dg = new DaftarGaji(2);
        Dosen ds = new Dosen("1234", "WisangGarnies", "Jombang", 200000);
        Dosen ds1 = new Dosen("6789", "RasyidRazeka", "Kediri", 250000);

        ds.setSKS(20);
        ds1.setSKS(25);
        dg.addPegawai(ds);
        dg.addPegawai(ds1);
        dg.printSemua();
    }
}
