package me.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ע�������ݿ��ӳ���ʵ����
 */
@Retention(RetentionPolicy.RUNTIME)// ������ע��
@Target(ElementType.TYPE)// ֻ�������������Ϸ�

//�Զ���ע��
public @interface Table {
    /**
     * ָ��ӳ��������
     *
     * @return
     */
    String value();
}

