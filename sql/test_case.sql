drop table if exists `test_case`;

CREATE TABLE `test_case` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `case_name` VARCHAR(512) NOT NULL DEFAULT '' COMMENT '用例名称',
    `biz_name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '所属业务线',
    `project_name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '所属项目',
    ``
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试用例表';