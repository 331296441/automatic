drop table if exists `test_case`;

CREATE TABLE `test_case` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `case_name` VARCHAR(512) NOT NULL DEFAULT '' COMMENT '用例名称',
    `case_type` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '用例类型',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试用例表';