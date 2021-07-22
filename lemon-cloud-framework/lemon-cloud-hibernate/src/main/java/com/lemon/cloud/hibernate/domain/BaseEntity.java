package com.lemon.cloud.hibernate.domain;

import com.lemon.cloud.core.serializer.ObjectSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/** @author marklin */
@Setter
@Getter
public abstract class BaseEntity implements ObjectSerializer {
  private static final long serialVersionUID = -5833444500136634795L;
  /** 主键id */
  private Long id;
  /** 租户id */
  private Long tenantId;
  /** 系统版本号 */
  private Long version;
  /** 创建人id */
  private Long creatorId;
  /** 创建人 */
  private String creatorName;
  /** 创建时间 */
  private LocalDateTime createTime;
  /** 更新人id */
  private Long updatorId;
  /** 更新人 */
  private String updatorName;
  /** 更新时间 */
  private LocalDateTime updateTime;
  /** 数据状态[0-正常 1-禁用] */
  private Integer status;
  /** 是否删除[0-否 1-是] */
  private Integer isRemove;
  /** 备注描述 */
  private String remark;
}
