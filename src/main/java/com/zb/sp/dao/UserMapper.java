package com.zb.sp.dao;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<Map> list(Map map);

    public List<Map> getAllRoles();

    public int save(Map map);
}
