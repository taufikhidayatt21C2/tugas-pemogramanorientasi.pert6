public class Pegawai {
    private String nama;
    private double gajiPokok;

    //set
    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setgajiPokok(double gajipokok){
        this.gajiPokok = gajipokok;
    }

    

    //get
    public String getNama(){
        return this.nama ;
    }
    public double getgajiPokok(){
         return this.gajiPokok ;
        }
    

    public void cetakInfo() {
        System.out.println ("Nama   : " + getNama());
        System.out.println ("gajiPokok : " + getgajiPokok());
    }

}