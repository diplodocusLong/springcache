package com.lianglong.cache.service;

import com.lianglong.cache.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 员工信息表 服务类
 * </p>
 *
 * @author lianglong
 * @since 2019-06-05
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> listAll();

    Employee addEmployee(Employee employee);
}
