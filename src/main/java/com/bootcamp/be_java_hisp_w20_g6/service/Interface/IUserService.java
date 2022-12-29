package com.bootcamp.be_java_hisp_w20_g6.service.Interface;

import com.bootcamp.be_java_hisp_w20_g6.dto.response.FollowersCountResponseDto;

public interface IUserService {

    public boolean followUser(int idFollowed, int idFollower);

    public FollowersCountResponseDto getFollowersCount(int id);

}
