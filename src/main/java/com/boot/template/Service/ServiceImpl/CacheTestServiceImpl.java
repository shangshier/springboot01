package com.boot.template.Service.ServiceImpl;

import com.boot.template.Service.CacheTestService;
import com.boot.template.pojo.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;

/**
 * @author: shangshanshan
 * @date: 2018-11-21 20:30
 * @Description: TODO
 */
@Service
public class CacheTestServiceImpl implements CacheTestService {
    @Override
    @CachePut(value = "user",key = "#user.id")
    public User save(User user) {

        return user;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public User findOne(User user) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(ClassUtils.getDefaultClassLoader());
    }
}
