package com.cafehub.api.controller.ward;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WardResponse {
    private int id;
    private String name;
    private int gsoId;
    private String districtName;
}
