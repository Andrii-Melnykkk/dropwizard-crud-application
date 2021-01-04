package com.example;

import com.example.controller.UserController;
import com.example.repository.UserRepo;
import com.example.service.UserService;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DropwizardApplication extends Application <DropwizardConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
    }


    @Override
    public void run(DropwizardConfiguration configuration, Environment environment) throws Exception {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mssql");
        final UserRepo userRepo = jdbi.onDemand(UserRepo.class);
        final UserService userService = new UserService(userRepo);
        final UserController userController = new UserController(userService);
        environment.jersey().register(userController);
    }
}
