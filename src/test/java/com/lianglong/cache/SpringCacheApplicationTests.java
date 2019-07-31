package com.lianglong.cache;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.lianglong.cache.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCacheApplicationTests {



    @Test
    public void contextLoads() {

        Employee employee = new Employee();
        employee.setId(1L)
                .setEmpName("王子二")
                .update(new UpdateWrapper<Employee>().eq("emp_name","王子一"));


    }

}
