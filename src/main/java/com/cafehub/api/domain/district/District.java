package com.cafehub.api.domain.district;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class District {
    private int id;
    private String name;
    private int gsoId;
    private String provinceName;
}
