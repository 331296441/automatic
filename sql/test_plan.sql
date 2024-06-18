drop table if exists `test_plan`;

CREATE TABLE `test_plan` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `biz_name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '所属业务线',
    `project_name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '所属项目',
    `create_user` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '创建人',
    `update_user` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '更新人',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT ON UPDATE CURRENT_TIMESTAMP '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试计划表';