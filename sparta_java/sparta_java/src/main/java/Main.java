import retrofit2.Call;

import java.io.IOError;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Call<Object> result = RetrofitClient.getApi().getUsers(3);

        try{
            System.out.println(result.execute().body());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}