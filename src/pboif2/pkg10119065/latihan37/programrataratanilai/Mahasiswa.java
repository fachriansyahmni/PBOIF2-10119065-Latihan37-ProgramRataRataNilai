package pboif2.pkg10119065.latihan37.programrataratanilai;

/**
 *
 * @author Fachriansyah PC
 */
public class Mahasiswa {
    private int totMahasiswa;
    private double nilai = 0;
    
    public int getTotMahasiswa()
    {
        return totMahasiswa;
    }
    
    public void setNilai(double nilai)
    {
        this.nilai = this.nilai + nilai;
    }
    
    public void setTotalMahasiswa(int totMahasiswa){
        this.totMahasiswa = totMahasiswa;
    }
    
    public double calcRataRata()
    {
        return nilai / totMahasiswa;
    }
}
