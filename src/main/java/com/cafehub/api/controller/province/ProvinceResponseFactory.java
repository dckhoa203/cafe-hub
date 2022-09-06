package com.cafehub.api.controller.province;

import com.cafehub.api.domain.province.Province;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProvinceResponseFactory {
    @Autowired
    ModelMapper mapper;

    public List<ProvinceResponse> toProvinceResponses(final List<Province> provinces) {
        return !provinces.isEmpty() ? provinces.stream().map(province -> mapper.map(province, ProvinceResponse.class))
                .collect(Collectors.toList()) : Collections.emptyList();
    }

    public ProvinceResponse toProvinceResponse(final Province province) {
        return mapper.map(province, ProvinceResponse.class);
    }
}
