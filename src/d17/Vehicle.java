package d17;
/* abstract classı normal class gibi doldurabilirsin fakat kullanamazsın önce bir classa inherit etmen lazım */
/* abstract methodlar ise açıklaması olmayan fakat yeni yazacağın koddac olması gereken ifadeler sana bunu hatırlatması
için yazıyorsun
 */
abstract public class Vehicle {
    private int horsepower;
    private int tork;
    Vehicle(int horsepower,int tork){
        this.horsepower = horsepower;
        this.tork = tork;
    }
    abstract void honky_honky(int abc); /* bir abstract method bunu buraya koyduğun zaman inherit edilince yeni classda
    ismini yazman gerekiyor */
    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }
    public String getHorsepower(){
        return Integer.toString(this.horsepower);
    }
    public String getTork(){return Integer.toString(this.tork);}
    public void setTork(int tork){this.tork = tork;}


}
