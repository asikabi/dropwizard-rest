package com.taxtelecom.chelnyedu.dropwizard.dao;

import org.skife.jdbi.v2.sqlobject.*;

/**
 * Created by user on 17.07.17.
 */
public interface UserDAO {
    @SqlQuery("select count(*) from users where username = :username and password = :password")
    int getUser(@Bind("username") String username, @Bind("password") String password);
}
