package com.bootcamp.be_java_hisp_w20_g6.service.Implement;

import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowedListResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersCountResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersListResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.UserResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.exception.FollowerExistsException;
import com.bootcamp.be_java_hisp_w20_g6.exception.UserExistsException;
import com.bootcamp.be_java_hisp_w20_g6.exception.UserNotFoundException;
import com.bootcamp.be_java_hisp_w20_g6.model.UserModel;
import com.bootcamp.be_java_hisp_w20_g6.repository.UserRepository;
import com.bootcamp.be_java_hisp_w20_g6.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

    public UserModel getUserById(int id){
        UserModel user = userRepository.getUserById(id);
        if(user == null) throw new UserNotFoundException("Usuario no existe");
        return user;  
    }

    @Override
    public FollowersCountResponseDto getFollowersCount(int id) {
        try{
            UserModel user = userRepository.getUserById(id);
            return new FollowersCountResponseDto(id, user.getUser_name(), user.getFollowers().size());

        }catch(NullPointerException e){
            throw new UserExistsException("Usuario no existe.");
        }
    }

    @Override
    public FollowersListResponseDto getFollowersList(int id) {
        try{
            UserModel user = userRepository.getUserById(id);
            List<UserResponseDto> followers = getUserResponseDtos(user.getFollowers());
            return new FollowersListResponseDto(id, user.getUser_name(), followers);

        }catch(NullPointerException e){
            throw new UserExistsException("Usuario no existe.");
        }
    }

    @Override
    public FollowedListResponseDto getFollowedList(int id) {
        try{
            UserModel user = userRepository.getUserById(id);
            List<UserResponseDto> followers = getUserResponseDtos(user.getFollowed());
            return new FollowedListResponseDto(id, user.getUser_name(), followers);

        }catch(NullPointerException e){
            throw new UserExistsException("Usuario no existe.");
        }
    }

    private List<UserResponseDto> getUserResponseDtos(List<Integer> userList) {
        List<UserResponseDto> followers = userList
                .stream()
                .map(u -> new UserResponseDto(u , userRepository.getUserById(u).getUser_name())).collect(Collectors.toList());
        return followers;
    }

   

}
