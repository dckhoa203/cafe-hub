package com.cafehub.api.domain.province;

import java.util.List;
import java.util.Optional;

public interface ProvinceRepository {
    List<Province> getAll();
    Optional<Province> getById(final int id);
}
