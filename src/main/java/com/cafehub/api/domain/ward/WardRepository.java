package com.cafehub.api.domain.ward;

import java.util.List;
import java.util.Optional;

public interface WardRepository {
    List<Ward> getByDistrict(final int districtId);
    Optional<Ward> getById(final int id);
}
