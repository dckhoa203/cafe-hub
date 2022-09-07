package com.cafehub.api.domain.district;

import java.util.List;
import java.util.Optional;

public interface DistrictRepository {
    List<District> getByProvince(final int provinceId);
    Optional<District> getById(final int id);
}
