package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.*;



import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface SpecialMapper {
    //查询最新专题

    @Select("SELECT * FROM t_special ORDER BY updated DESC LIMIT 0,4")
    List<Special> selectRecent();

    //查询所有专题
    @Select("SELECT * FROM t_special")
    @Results({
            @Result(id = true, property = "specialId", column = "special_id", javaType = String.class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "introduction", column = "introduction", javaType = String.class),
            @Result(property = "banner", column = "banner", javaType = String.class),
            @Result(property = "viewCount", column = "view_count",javaType = Integer.class),
            @Result(property = "followersCount", column = "followers_count",javaType = Integer.class),
            @Result(property = "updated", column = "updated", javaType = Date.class),
            @Result(property = "sections", column = "special_id",
                     many = @Many(select = "com.scs.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId"))

    })
    List<Map> selectAll();
}
