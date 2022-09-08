package com.cafehub.api.domain.ward;

import java.util.List;

public interface WardRepository {
    List<Ward> getByDistrict(final int districtId);
}
