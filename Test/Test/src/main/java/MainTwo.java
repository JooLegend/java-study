public class MainTwo {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        int num = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) {
                answer += split[i];
            }
            else if(num%2==0){
                split[i] = split[i].toUpperCase();
                answer += split[i];
                num++;
            } else if (num%2==1) {
                split[i] = split[i].toLowerCase();
                answer += split[i];
                num++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MainTwo method = new MainTwo();
        String s = "hang hae ninety nine";
        System.out.println(method.solution(s));
    }
}
