public class pegawai {
    public int jabatan;
    public int lamakerja, gajitotal;
    public final int gaji = 2500000;
    public final int bonus = 250000;
    
    public pegawai (int lamakerja){
        this.lamakerja = lamakerja;
    }

    public int getJabatan() {
        return jabatan;
    }

    public int getLamaKerja() {
        return lamakerja;
    }
    
    public void setBonus() {
        if (lamakerja <= 5) {
            gajitotal = gaji;
        } else {
            gajitotal = gaji + bonus;
        }
        System.out.println("GAJI POKOK : Rp "+gajitotal+",00 per bulan");
    }
    
}
