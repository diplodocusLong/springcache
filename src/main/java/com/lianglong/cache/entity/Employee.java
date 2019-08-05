package com.lianglong.cache.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工信息表
 * </p>
 *
 * @author lianglong
 * @since 2019-06-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Employee对象", description="员工信息表")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "员工姓名")
    @TableField("emp_name")
    private String empName;

    @ApiModelProperty(value = "员工年龄")
    private Integer empAge;

    @ApiModelProperty(value = "部门id")
    private Integer deptId;

    @ApiModelProperty(value = "入职时间")
    @TableField(fill=FieldFill.INSERT)
    private LocalDate createDate;

    @ApiModelProperty(value = "最后更新时间")
    @TableField(fill=FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "是否离职 0未离职 1 已离职")
    @TableField(fill= FieldFill.INSERT)
    @TableLogic
    private Integer isOut;

    @ApiModelProperty(value = "更新版本号")
    @Version
    @TableField(fill=FieldFill.INSERT)
    private Integer version;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
