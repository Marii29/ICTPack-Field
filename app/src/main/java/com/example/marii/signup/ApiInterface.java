package com.example.marii.signup;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("register.php")
    Call<User> performRegistration(@Query("name") String Name, @Query("password") String Password, @Query("e_mail") String E_mail, @Query("phone_no") String Phone_no);

    @GET("login.php")
    Call<User>performLogin(@Query("name") String Name, @Query("password") String Password);

}
