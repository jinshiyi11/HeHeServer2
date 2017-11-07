package com.shuai.hehe.api.mapper;

import com.shuai.hehe.api.entity.User;
import com.shuai.hehe.api.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 *
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getUserList();

    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUser(long id);

    @Select("SELECT * FROM user WHERE phone=#{phone}")
    User getByPhone(String phone);

    @Insert("INSERT INTO user(phone,password,nickName,headImageUrl)" +
            " VALUES(#{phone},#{password},#{nickName},#{headImageUrl})")
    void addUser(User user);

//    @UpdateProvider(type = SqlBuilder.class, method = "buildUpdateSql")
//    void updateUser(User user);

    @Delete("DELETE FROM user WHERE id=#{id}")
    void deleteUser(int id);

//    class SqlBuilder {
//        public String buildUpdateSql(final User user) {
//            return new SQL() {{
//                UPDATE("user");
//                if (user.getName() != null) {
//                    SET("name = #{name}");
//                }
//                if (user.getTitle() != null) {
//                    SET("title = #{title}");
//                }
//                WHERE("id=#{id}");
//            }}.toString();
//        }
//    }
}