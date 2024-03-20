package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行公共字段自动填充
 */
@Target(ElementType.METHOD) // 注解作用于方法
@Retention(RetentionPolicy.RUNTIME) // 注解在运行时生效
public @interface AutoFill {
    // 数据库操作类型: UPDATE INSERT
    // 这两种操作才需要自动填充公共字段，别的操作类型不需要
    OperationType value();
}
