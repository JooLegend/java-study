public class Child extends People {
    public Child(String name, int age, int speed,int x, int y) {
        super(name, age, speed,x,y);
    }
    void run(){
        this.x = x;
        this.y = y;
    }

    void swim(){
        this.x = x;
        this.y = y;
    }
}
