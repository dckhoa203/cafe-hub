package com.cafehub.api.controller.district;

import com.cafehub.api.validation.Number;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistrictGetByProvinceRequest {
    private static final String PROVINCE_ID_INVALID_MESSAGE = "Province id must be numeric and greater than 0";

    @Number(message = PROVINCE_ID_INVALID_MESSAGE)
    private String provinceId;
}
