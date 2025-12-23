package tr.edu.istiklal;

public class Loan {
    private double faizOrani;
    private int yilSayisi;
    private double krediTutari;

    public Loan(double faizOrani, int yilSayisi, double krediTutari) {
        setFaizOrani(faizOrani);
        setYilSayisi(yilSayisi);
        setKrediTutari(krediTutari);
    }

    public Loan() {
        this(2.5, 1, 1000);
    }

    public void setFaizOrani(double oran) {
        if (oran <= 0)
            throw new IllegalArgumentException("Faiz oranı 0'dan büyük olmalıdır.");
        this.faizOrani = oran;
    }

    public void setYilSayisi(int yil) {
        if (yil <= 0)
            throw new IllegalArgumentException("Yıl sayısı 0'dan büyük olmalıdır.");
        this.yilSayisi = yil;
    }

    public void setKrediTutari(double tutar) {
        if (tutar <= 0)
            throw new IllegalArgumentException("Kredi tutarı 0'dan büyük olmalıdır.");
        this.krediTutari = tutar;
    }

    public double getAylikOdeme() {
        double aylikFaiz = faizOrani / 1200;
        return krediTutari * aylikFaiz /
                (1 - 1 / Math.pow(1 + aylikFaiz, yilSayisi * 12));
    }

    public double getToplamOdeme() {
        return getAylikOdeme() * yilSayisi * 12;
    }
}
