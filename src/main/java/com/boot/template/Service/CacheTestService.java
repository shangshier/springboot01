package com.boot.template.Service;

import com.boot.template.pojo.User;

/**
 * @author: shangshanshan
 * @date: 2018-11-21 20:22
 * @Description: TODO
 */
public interface CacheTestService {

    User save(User user);

    void remove(int id);

    User findOne(User user);
}
