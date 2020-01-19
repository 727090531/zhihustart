package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private String viewCount;
    private Integer followsCount;
    private Date updated;
}
