package com.youyigejia.crm.queryvo;

import com.youyigejia.crm.util.StringUtil;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

/**
 * Created by 张磊 on 2017/7/9.
 */
public class QueryVoProxyFactory {

    public static  <T>   T  stringReturnTypeProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(target.getClass().getClassLoader());
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((InvocationHandler) (o, method, objects) -> {
            Object result;
            if (method.getName().startsWith("get") && (method.getReturnType() == String.class)) {
                String temp = (String) method.invoke(target, objects);
                result = StringUtil.handle(temp);
            } else {
                result = method.invoke(target, objects);
            }
            return result;
        });
        return (T) enhancer.create();
    }

}
