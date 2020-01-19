package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

public interface SpecialService {
    List<Map> selectAll();
    List<Special> selectRecent();
}
