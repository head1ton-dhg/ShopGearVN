package com.uchiha.gearshop.controller.request;

import lombok.Data;

@Data
public class CategoryRequest {
    private String name;
    private String description;
    private String photo;
}
