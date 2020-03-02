package com.zb.sp.service;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Map> list(Map map);

    public List<Map> getAllRoles();

    public int save(Map map);
}
