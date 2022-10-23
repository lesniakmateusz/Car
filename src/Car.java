public class Car {

    private int id;
    private String marka;
    private String model;
    private int rok_produkcji;
    private double pojemnosc_silnika;
    private long przebieg;
    private String paliwo;
    private String kraj_pochodzenia;
    private String kolor;


    public Car(int id,String marka,String model,int rok_produkcji,double pojemnosc_silnika,long przebieg,String paliwo,String kraj_pochodzenia,String kolor){

        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this.kraj_pochodzenia = kraj_pochodzenia;
        this.kolor = kolor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public double getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(double pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public long getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(long przebieg) {
        this.przebieg = przebieg;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }

    public String getKraj_pochodzenia() {
        return kraj_pochodzenia;
    }

    public void setKraj_pochodzenia(String kraj_pochodzenia) {
        this.kraj_pochodzenia = kraj_pochodzenia;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", pojemnosc_silnika=" + pojemnosc_silnika +
                ", przebieg=" + przebieg +
                ", paliwo='" + paliwo + '\'' +
                ", kraj_pochodzenia='" + kraj_pochodzenia + '\'' +
                ", kolor='" + kolor;
    }
}
