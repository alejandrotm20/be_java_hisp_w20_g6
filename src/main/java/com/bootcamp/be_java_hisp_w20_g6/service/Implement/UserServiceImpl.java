package com.bootcamp.be_java_hisp_w20_g6.service.Implement;

import com.bootcamp.be_java_hisp_w20_g6.exception.FollowerExistsException;
import com.bootcamp.be_java_hisp_w20_g6.exception.UserExistsException;
import com.bootcamp.be_java_hisp_w20_g6.model.UserModel;
import com.bootcamp.be_java_hisp_w20_g6.repository.UserRepository;
import com.bootcamp.be_java_hisp_w20_g6.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public boolean followUser(int idstar, int idfan) {
        try{
            UserModel followed = userRepository.getUserById(idstar);
            UserModel follower = userRepository.getUserById(idfan);

            ArrayList<Integer> fanFollowedList = follower.getFollowed();
            if(!fanFollowedList.contains(idstar)){
                fanFollowedList.add(idstar);
                followed.getFollowers().add(idfan);
                return true;
            }else{
                throw new FollowerExistsException("Usuario ya esta siguiendo al vendedor.");
            }
        }catch(NullPointerException e){
            throw new UserExistsException("Usuario no existe.");
        }
    }
}
