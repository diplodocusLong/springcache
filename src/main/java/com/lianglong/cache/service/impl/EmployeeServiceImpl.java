package com.lianglong.cache.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lianglong.cache.entity.Employee;
import com.lianglong.cache.mapper.EmployeeMapper;
import com.lianglong.cache.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author lianglong
 * @since 2019-06-05
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    @Cacheable(value="empAll",key="#root.methodName")
    public List<Employee> listAll() {
        return employeeMapper.selectList(new QueryWrapper<>());
    }

    @Override
    @CachePut(value="emp",key="#result.id",unless = "#result==null")
    public Employee addEmployee(Employee employee) {

         employeeMapper.insert(employee);

        return employeeMapper.selectById(employee.getId());
    }


}
