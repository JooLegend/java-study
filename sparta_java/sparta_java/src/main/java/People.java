public class People {
    String name;
    int age;
    int x,y;
    int speed;

    People(String name, int age, int speed,int x, int y){
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    void work(){
        this.x = x;
        this.y = y;
    }
    void printLocation(){
        System.out.println("현재 위치 : (" + x + "," + y + ")");
    }
    public void checkInformation(){
        System.out.println("저는 " + name + "이고 나이는 " + age + "이고 속도는 " + speed + "위치는 " + x+","+y+"입니다.");
    }
}