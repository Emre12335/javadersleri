package d17;
/* çağırıp execute ettiğimizde vehicle hata verir çünkü abstract */
/* car ı ise istediğimiz gibi çağırabiliriz */

public class Main {
    public static void main(String[] args) {
         /* Vehicle v1 = new Vehicle(); hata alır. */
        Car c1 = new Car(100,100,2);
        c1.setHorsepower(1000);
        System.out.println(c1.getHorsepower());
        System.out.println(c1.getSusnum());

    }
}
