package com.cafehub.api.controller.ward;

import com.cafehub.api.domain.ward.Ward;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WardResponseFactory {
    @Autowired
    private ModelMapper mapper;

    public List<WardResponse> toWardResponses(final List<Ward> wards) {
        return !wards.isEmpty() ? wards.stream().map(ward -> mapper.map(ward, WardResponse.class))
                .collect(Collectors.toList()) : Collections.emptyList();
    }

    public WardResponse toWardResponse(final Ward ward) {
        return mapper.map(ward, WardResponse.class);
    }
 }
