public class SoftwareEngineer extends pegawai {

    private final int tunjangan = 5500000;
    private final int bonusperbulan = 300000;

    public SoftwareEngineer(int lamakerja) {
        super(lamakerja);
    }

    public void setBonus() {
        if (lamakerja <= 5) {
            gajitotal = gaji + tunjangan + bonusperbulan;
        } else {
            gajitotal = gaji + tunjangan + bonus + bonusperbulan;
        }
        System.out.println("GAJI POKOK : Rp "+gajitotal+",00 per bulan");
    }
}
