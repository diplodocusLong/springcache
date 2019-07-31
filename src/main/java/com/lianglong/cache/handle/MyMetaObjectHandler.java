package com.lianglong.cache.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createDate", LocalDate.now(), metaObject);
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("version", 0, metaObject);
        this.setFieldValByName("isOut", 0, metaObject);



    }

    @Override
    public void updateFill(MetaObject metaObject) {

        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);

    }
}
