package com.honvay.cloud.framework.criteria.annotation.group;

import com.honvay.cloud.framework.criteria.annotation.Le;

import java.lang.annotation.*;

/**
 * @author LIQIU
 * @date 2018-4-18
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LeGroup {

    Le[] value();
}
