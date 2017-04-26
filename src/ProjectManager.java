public class ProjectManager extends pegawai {

    private  int gatot;
    private final int tunjangan = 6000000;
    private final int bonusperbulan = 450000;
    private final int apresiasi = 700000;

    public ProjectManager(int lamakerja) {
        super(lamakerja);
    }

    public void setBonus() {
        if (lamakerja <= 5) {
            gajitotal = gaji + tunjangan + bonusperbulan;
        } else if (lamakerja > 5 && lamakerja < 10) {
            gajitotal = gaji + tunjangan + bonus + bonusperbulan;
        }else{
            gajitotal = gaji + tunjangan + bonus + bonusperbulan + apresiasi;
        }
        System.out.println("GAJI POKOK : Rp "+gajitotal+",00 per bulan");
    }

}
