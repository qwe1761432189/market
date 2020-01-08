package com.mxz.supermarket.utils.power;

import java.lang.annotation.*;

/**
 * @author whg
 * @date 2019/12/4 15:25
 **/
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
public @interface ForwardPathToUserLogin {

    String path() default "";
}
