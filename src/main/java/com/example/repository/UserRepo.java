package com.example.repository;

import com.example.entity.User;
import com.example.entity.mapper.UserMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(UserMapper.class)
public interface UserRepo {

    @SqlQuery("select * from mssql.dbo.users")
    List<User> getAll();

    @SqlQuery("select * from mssql.dbo.users where ID = :id")
    User getById(@Bind("id") int id);

    @SqlUpdate("delete from mssql.dbo.users where ID = :id")
    void deleteById(@Bind("id") int id);

    @SqlUpdate("update mssql.dbo.users set NAME = :name where ID = :id")
    void update(@BindBean User person);

    @SqlUpdate("insert into mssql.dbo.users (ID, NAME) values (:id, :name)")
    void saveById(@BindBean User person);

}
