package com.imagify.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data                  
public class CommunityDTO {                   
    private String id;
    private String name;
    private String description;

    private List<String> members = new ArrayList<>();

    private String createdBy;
}
