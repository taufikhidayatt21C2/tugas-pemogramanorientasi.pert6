public class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double Bonus) {
        this.bonus = Bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("bonus : " + getBonus());

    }
}