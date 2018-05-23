package me.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 列注解
 * @author Administrator
 *
 */

/**
 * 注解成员变量映射到的表的字段
 */
@Retention(RetentionPolicy.RUNTIME) // 运行期注解
@Target(ElementType.FIELD) // 只能用在属性上方
// 自定义注解
public @interface Column {
	String value();// 表的字段名称
}
