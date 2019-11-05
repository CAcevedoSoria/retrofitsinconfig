package com.ingarucadev.api.users.expose.web;


import com.ingarucadev.api.users.model.thirdparty.UserApi;
import com.ingarucadev.api.users.service.UserService;
import com.ingarucadev.api.users.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1.0/students")
public class UserController {


  @Autowired
  private UserServiceImpl userService;

  @GetMapping("/all")
  public List<UserApi> getPlaylist() throws Exception {
    return  userService.findAll();
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UserApi> getPlaylistById(@PathVariable("id") String id) throws IOException {
    return ResponseEntity.ok()
      .contentType(MediaType.APPLICATION_JSON)
      .body(userService.getUser(id));
  }


}
