package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UserController {

    UserService userService;

    @GET
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @GET
    @Path("/{id}")
    public User get(@PathParam("id") Integer id) {
        return userService.getById(id);
    }

    @POST
    public User add(@Valid User user) {
        userService.save(user);
        return user;
    }

    @PUT
    @Path("/{id}")
    public User update(@PathParam("id") Integer id, @Valid User user) {
        User updateUser = new User(id, user.getName());
        userService.update(updateUser);
        return updateUser;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        userService.deleteById(id);
    }


    public UserController(UserService userService) {
        this.userService = userService;
    }
}
