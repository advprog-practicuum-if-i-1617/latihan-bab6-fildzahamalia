import java.util.Scanner;

public class MainKaryawan {

    public static void main(String[] args) {
        int pil, lama;
        Scanner in = new Scanner(System.in);
        System.out.print("====PERUSAHAAN X====\n1. Karyawan\n2. Software Engineer\n3. Project Manager\nJabatan : ");
        pil = in.nextInt();
        System.out.print("Lama kerja : ");
        switch (pil) {
            case 1: {
                pegawai p = new pegawai(in.nextInt());
                p.setBonus();
            }
            break;
            case 2: {
                SoftwareEngineer se = new SoftwareEngineer(in.nextInt());
                se.setBonus();
            }
            break;
            case 3: {
                ProjectManager pm = new ProjectManager(in.nextInt());
                pm.setBonus();
            }
            break;
        }
    }

}
