package com.skylab.yilbasi.business.abstracts;

import com.skylab.yilbasi.entities.dtos.AddUserDto;
import com.skylab.yilbasi.entities.dtos.GetUserDto;

public interface UserService {

    GetUserDto getUserById(String userId);

    GetUserDto getUserByEmail(String email);

    GetUserDto addUser(AddUserDto addUserDto);

}
