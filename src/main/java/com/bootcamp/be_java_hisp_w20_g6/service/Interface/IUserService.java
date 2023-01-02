package com.bootcamp.be_java_hisp_w20_g6.service.Interface;

import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowedListResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersCountResponseDto;
import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersListResponseDto;


public interface IUserService {

    public boolean followUser(int idFollowed, int idFollower);

    public FollowersCountResponseDto getFollowersCount(int id);

    public FollowersListResponseDto getFollowersList(int id);

    public FollowedListResponseDto getFollowedList(int id);

}
