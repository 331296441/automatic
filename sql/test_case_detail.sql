drop table if exists `test_case_detail`;

CREATE TABLE `test_case_detail` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
        PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试用例详情表';