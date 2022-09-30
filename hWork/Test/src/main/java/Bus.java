class Bus extends Daejung{
    int busNum;
    int passenger;
    int money = 1000;
    int gas = 0;
    boolean change = true;
    String status = "";

    public Bus(int num,int passenger) {
        this.num = num;
        this.passenger = passenger;
    }

    public void start(){
        this.passenger++;
        this.money=money*(passenger-1);
        System.out.println("버스 번호 : " + num + "번" + "\n승객수 : " + (passenger-1) + "\n잔여 승객수 : " + (maxHuman - (passenger-1))+ "\n요금 : " + money);
        if((passenger-1)>maxHuman){
            System.out.println("최대 승객 수 초과");
        }
    }
    public int oil(int oil){
        System.out.println("주유량 = " + oil);
        gas += oil;
        return gas;
    }
    //    public int fuel(int gas){
//        gas += oil;
//        return gas;
//    }
    boolean bstatus(boolean change){
        if(change==true){
            status = "운행중";
        }else {
            status = "차고지행";
        }
        return change;
    }


    public void turn(boolean change, int oil){
        System.out.println("상태 = " + status + " 주유량 = " + oil(gas));
    }
}