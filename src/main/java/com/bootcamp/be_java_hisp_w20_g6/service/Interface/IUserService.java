package com.bootcamp.be_java_hisp_w20_g6.service.Interface;

import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowedListResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersCountResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersListResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.model.UserModel;


public interface IUserService {

    public boolean followUser(int idFollower,int idFollowed);

    public FollowersCountResponseDto getFollowersCount(int id);

    public FollowersListResponseDto getFollowersList(int id);

    public FollowedListResponseDto getFollowedList(int id);

    public UserModel getUserById(int id);

    boolean unFollowUser(int idFollower, int idFollowed);
}
