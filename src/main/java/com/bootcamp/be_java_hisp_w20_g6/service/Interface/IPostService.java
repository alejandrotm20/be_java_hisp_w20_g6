package com.bootcamp.be_java_hisp_w20_g6.service.Interface;

import com.bootcamp.be_java_hisp_w20_g6.dto.request.PostRequestDto;

public interface IPostService {
    public boolean save(PostRequestDto postRequestDto);
}
