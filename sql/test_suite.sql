drop table if exists `test_suite`;

CREATE TABLE `test_suite` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '测试套表';