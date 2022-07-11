package d18;

public class Newfighter implements Archer{
    private int charge;
    @Override
    public void thor_arrow() {
        System.out.println("Baaam");
    }

    @Override
    public void charge_up(int charge) {
        this.charge += charge;
        System.out.printf("charged up %d %% \n", this.charge);
    }

    @Override
    public void show_charge() {
        System.out.printf("charge is %d %% \n",this.charge);
    }
}
/* gördüğün gibi aynı işlmei inheritance kullanmadan da yapabiliriz */
