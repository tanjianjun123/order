package com.tz.order.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author tanjianjun
 * @create 2018-11-19 11:38
 * //用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean。
 */
@Configuration
public class DispatcherServletConf implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //开启路径后缀匹配
        configurer.setUseRegisteredSuffixPatternMatch(true);
    }

    /**
     * 设置匹配*.action后缀请求
     * @param dispatcherServlet
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
        servletServletRegistrationBean.addUrlMappings("*.action");
        servletServletRegistrationBean.addUrlMappings("/configuration/ui");
        servletServletRegistrationBean.addUrlMappings("/swagger-resources");
        servletServletRegistrationBean.addUrlMappings("/v2/api-docs");
        servletServletRegistrationBean.addUrlMappings("/configuration/security");
        return servletServletRegistrationBean;
    }
}

