package com.ingarucadev.api.users.service.impl;


import com.ingarucadev.api.users.model.thirdparty.UserApi;

import com.ingarucadev.api.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl  {

  private static final String URI_PLAYLIST = "http://localhost:5000";

  Retrofit retrofit = new Retrofit.Builder().baseUrl(URI_PLAYLIST)
    .addConverterFactory(GsonConverterFactory.create()).build();

  UserService userService = retrofit.create(UserService.class);


  public List<UserApi> findAll() throws Exception{
    Call<List<UserApi>> playlist = userService.findAll();
    return playlist.execute().body();
  }

  public UserApi getUser(String id) throws IOException {
    Call<UserApi> playlistCall = userService.getUser(id);
    return playlistCall.execute().body();
  }



  }


