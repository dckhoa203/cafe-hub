package com.cafehub.api.controller.province;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceResponse {
    private int id;
    private String name;
    private int gsoId;
}
