
package tr.edu.istiklal;
    
public class CepTelefonu extends Urun {
    private String ozellik;
    private String marka;
    
    public CepTelefonu(String urunadi,double urunfiyati,String ozellik,String marka){
        super(urunadi, urunfiyati);
        this.ozellik=ozellik;
        this.marka=marka;
 
    }

    public String getMarka() {
        return marka;
    }

    public String getOzellik() {
        return ozellik;
    }

    @Override
    public double Kdvuygula() {
        return urunfiyati*1.18;
    }

   @Override
    public String toString() {
        return ozellik+" "+marka+" "+this.urunfiyati+"TL";
    }
    
}
