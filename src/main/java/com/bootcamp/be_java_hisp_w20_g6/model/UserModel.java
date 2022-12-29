package com.bootcamp.be_java_hisp_w20_g6.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {
    private int user_id;
    private String user_name;
    private ArrayList<Integer> followers;
    private ArrayList<Integer> followed;
}
