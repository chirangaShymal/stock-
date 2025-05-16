package com.imagify.dto;

import java.util.List;

import lombok.Data;

@Data
public class LearningPlanDTO {
    private String name;
    private String description;
    private List<String> topics;
    private List<String> resources;
}
 