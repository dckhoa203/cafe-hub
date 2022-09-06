package com.cafehub.api.repository.province;

import com.cafehub.api.domain.province.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProvinceMapper {
    @Select("SELECT id, name, gso_id AS gsoId FROM provinces WHERE is_deleted = 0")
    List<Province> getAll();

    @Select("SELECT id, name, gso_id AS gsoId FROM provinces WHERE id=#{id} AND is_deleted = 0")
    Province getById(@Param("id") final int id);
}
