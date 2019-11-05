package com.ingarucadev.api.users.service;


import com.ingarucadev.api.users.model.thirdparty.UserApi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


import java.util.List;

public interface UserService {


  @GET("/api/v1.0/students/{id}")
  Call<UserApi>getUser(@Path("id") String id);

  @GET("/api/v1.0/students")
  Call<List<UserApi>>findAll();

}
