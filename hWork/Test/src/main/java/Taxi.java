class Taxi extends Daejung{
    String destination;
    int passenger;
    int destinationDistance;
    int distance = 1;
    int fee = 3000;
    int distanceFee = 1000;
    int maxPeople=4;
    int gas = 100;
    boolean tStatus;
    String status = "";

    public Taxi(int num, int passenger,String destination, int destinationDistance) {
        this.num = num;
        this.passenger = passenger;
        this.destination = destination;
        this.destinationDistance = destinationDistance;
    }
    public boolean taxiStatus(boolean tStatus){
        if(tStatus == true){
            status = "운행중";
        }
        else {
            status = "일반";
        }
        return tStatus;
    }
    public void status(){
        System.out.println(num + "번 택시" + "주유량 : " + gas + "상태 : " + status);
    }
    public void start(){
        System.out.println("탑승 승객 수 : " + passenger + "\n잔여 승객 수 : " + (maxPeople-passenger) + "\n기본 요금 확인 : " + fee + "\n목적지 : " + destination + " \n목적지 까지 거리 : " + destinationDistance + "\n지불할 요금 : " + (destinationDistance * fee) + "\n상태 : " + tStatus);
        if(maxPeople<passenger){
            System.out.println("최대 승객수 초과");
        }
    }
    public void failStart(){
        if (gas<=0){
            System.out.println("주유량 : 0"+"상태 : " + status);
        }
    }
}