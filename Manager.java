public class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double Tunjangan) {
        this.tunjangan = Tunjangan;
    }

    public double getTunjangan() {
        return this.tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("tunjangan : " + getTunjangan());

    }
}