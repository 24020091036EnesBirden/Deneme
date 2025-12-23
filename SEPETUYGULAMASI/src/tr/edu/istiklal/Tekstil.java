
package tr.edu.istiklal;


public class Tekstil extends Urun{
    private String kumasturu;
    private int beden;
    private String ureticifirma;
    
    public Tekstil(String urunadi,double urunfiyati,String kumasturu,int beden,String ureticifirma){
        super(urunadi, urunfiyati);
        this.kumasturu=kumasturu;
        this.beden=beden;
        this.ureticifirma=ureticifirma;
    }

    public String getKumasturu() {
        return kumasturu;
    }

    public int getBeden() {
        return beden;
    }

    public String getUreticifirma() {
        return ureticifirma;
    }

    @Override
    public double Kdvuygula() {
       return urunfiyati*1.10;
    }
@Override
    public String toString() {
        return kumasturu+" "+beden+" "+ureticifirma+" "+this.urunfiyati+"TL";
    }
    
}
