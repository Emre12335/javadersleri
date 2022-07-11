package d19;

public class NewObject {
    private int first = 10;
    private int second = 10;
    private int third = 10;
    public int fourth = 10;
    NewObject(int first,int second,int third,int fourth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;}
    NewObject(int first,int second,int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    NewObject(int first,int second){
        this.first = first;
        this.second = second;
    }
    NewObject(int first){
        this.first = first;
    }
    NewObject(){}

    public void copy(NewObject n1){ /* bu şekilde istediğn elemanları kopyalayabiliyorsun ama çok etkil değil */
        this.first = n1.first;
        this.second = n1.second;
        this.third= n1.third;
        this.fourth = n1.fourth;
    }

    public void printall(){
        System.out.printf("1:%d/2:%d/3:%d/4:%d\n",this.first,this.second,this.third,this.fourth);
    }
}
