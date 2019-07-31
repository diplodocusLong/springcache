package com.lianglong.cache.controller;


import com.lianglong.cache.entity.Employee;
import com.lianglong.cache.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 员工信息表 前端控制器
 * </p>
 *
 * @author lianglong
 * @since 2019-06-05
 */
@RestController
@RequestMapping("/employee")
@Api("emp")
public class EmployeeController {
     @Autowired
    EmployeeService employeeService;

     @GetMapping("/listAll")
     @ApiOperation("查询所有用户")
     public List<Employee>  getAll(){

      return employeeService.listAll();

     }
     @PostMapping
     @ApiOperation("增加一个新员工")
     public Employee addEmployee(Employee employee){
        return employeeService.addEmployee(employee);
     }


}







