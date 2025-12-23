
package tr.edu.istiklal;


public class Ekmek extends Urun{
    private String ekmekturu;
    private double gramaj;
    
    public Ekmek(String urunadi,double urunfiyati,String ekmekturu,double gramaj){
       super(urunadi, urunfiyati);
        this.ekmekturu=ekmekturu;
        this.gramaj=gramaj;
        
    }

    public String getEkmekturu() {
        return ekmekturu;
    }

    public double getGramaj() {
        return gramaj;
    }

    @Override
    public double Kdvuygula() {
       return urunfiyati;
    }

    @Override
    public String toString() {
        return ekmekturu+" "+gramaj+"TL";
    }
    
}
