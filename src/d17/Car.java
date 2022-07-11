package d17;

public class Car extends Vehicle{
    int susnum;
    void honky_honky(int abc){ /* abstract method yarrattığımız için bunu çağırmasaydık bu çalışmazdı */
        System.out.println(abc);
    }
    Car(int horsepower, int tork, int susnum) {
        super(horsepower, tork);
        this.susnum = susnum;
    }
    public void setSusnum(int susnum){this.susnum = susnum;}
    public String getSusnum(){return Integer.toString(this.susnum);}
}
