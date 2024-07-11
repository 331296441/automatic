drop table if exists `test_case_step`;

CREATE TABLE `test_case_step` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `test_case_id` bigint unsigned NOT NULL COMMENT '测试用例id',
        PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试用例步骤表';