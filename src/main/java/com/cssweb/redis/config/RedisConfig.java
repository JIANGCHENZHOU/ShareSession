package com.cssweb.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by jcz on 2017/8/30.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=60)
public class RedisConfig {
}