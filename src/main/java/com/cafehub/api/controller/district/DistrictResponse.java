package com.cafehub.api.controller.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistrictResponse {
    private int id;
    private String name;
    private int gsoId;
    private String provinceName;
}
