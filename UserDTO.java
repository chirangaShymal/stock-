package com.imagify.dto;

import lombok.Data;

import java.util.List;

import com.imagify.entity.FollowInfo;
import com.imagify.entity.LearningPlan;

@Data
public class UserDTO {
    private String id;
    private String email;
    private String name;
    private String password;
    private List<FollowInfo> followers;
    private List<FollowInfo> following;
    private List<LearningPlan> learningPlans;
}
