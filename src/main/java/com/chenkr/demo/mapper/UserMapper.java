package com.chenkr.demo.mapper;

import com.chenkr.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * Select user By userID
     * @param userID
     * @return
     */
    User selectUserByID(String userID);

    /**
     * You can login with this.
     * @param userName
     * @param email
     * @param userPass
     * @return
     */
    User selectUserByLoginParams(String userName, String email, String userPass);


}
