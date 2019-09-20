//package com.boot.template.config;
//
//import org.springframework.boot.autoconfigure.cache.CacheProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-31 19:10
// * @Description: CacheMagger配置
// */
//@Configuration
//@EnableCaching
//@EnableConfigurationProperties(CacheProperties.class)
//public class CacheManagerConfig {
//
//    private final CacheProperties cacheProperties;
//
//    public CacheManagerConfig(CacheProperties cacheProperties) {
//        this.cacheProperties = cacheProperties;
//    }
//
//    public interface CacheManager {
//
//        /**
//         * redis
//         */
//        String REDIS_CACHE_MANAGER = "redisCacheManager";
//        /**
//         * ehCache
//         */
//        String EHCACHE_CACHE_MAANGER = "ehCacheCacheManager";
//
//    }
//
//    /**
//     * 缓存名，名称暗示了缓存时长 注意： 如果添加了新的缓存名，需要同时在下面的#RedisCacheCustomizer里配置名称对应的缓存时长
//     * ，时长为0代表永不过期；缓存名最好公司内部唯一，因为可能多个项目共用一个redis。
//     *
//     * @see ##RedisCacheCustomizer#customize
//     * (RedisCacheManager)
//     */
//    public interface CacheNames {
//        /** 15分钟缓存组 */
//        String CACHE_15MINS = "cp_salary:cache:15m";
//        /** 30分钟缓存组 */
//        String CACHE_30MINS = "cp_salary:cache:30m";
//        /** 60分钟缓存组 */
//        String CACHE_60MINS = "cp_salary:cache:60m";
//        /** 180分钟缓存组 */
//        String CACHE_180MINS = "cp_salary:cache:180m";
//    }
//
//}
