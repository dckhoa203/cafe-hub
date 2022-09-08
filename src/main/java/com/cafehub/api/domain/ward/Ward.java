package com.cafehub.api.domain.ward;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Ward {
    private int id;
    private String name;
    private int gsoId;
    private String districtName;
}
