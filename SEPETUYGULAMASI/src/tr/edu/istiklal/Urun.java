
package tr.edu.istiklal;

public abstract class Urun {
    protected String urunadi;
   protected double urunfiyati;

public Urun (String urunadi,double urunfiyati){
    this.urunadi=urunadi;
    this.urunfiyati=urunfiyati;
}

    public String getUrunadi() {
        return urunadi;
    }

    public double getUrunfiyati() {
        return urunfiyati;
    }
    public abstract double Kdvuygula();

    @Override
    public String toString() {
      return urunadi;
    }
    
}
