package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface SectionMapper {
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);

}
