drop table if exists `test_case`;

CREATE TABLE `test_case` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `case_name` VARCHAR(512) NOT NULL DEFAULT '' COMMENT '用例名称',
    `case_type` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '用例类型',
    `create_user` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '创建人',
    `update_user` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '更新人',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT ON UPDATE CURRENT_TIMESTAMP '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试用例表';