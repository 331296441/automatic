drop table if exists `test_case_step_interface`;

CREATE TABLE `test_case_step_interface` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `step_type` int(2) not null comment '默认类型 0 HTTP接口 1 Web UI 2 API驱动  3移动端',
    `desc` varchar(255) DEFAULT NULL COMMENT '步骤描述',
    `interface_url` VARCHAR(255) DEFAULT NULL COMMENT '接口地址',
    `method` VARCHAR(255) DEFAULT NULL COMMENT '请求方法',
    `content_type` VARCHAR(255) DEFAULT NULL COMMENT '接口请求体',
    `interface_headers` VARCHAR(255) DEFAULT NULL COMMENT '接口请求头',
    `interface_params` VARCHAR(255) DEFAULT NULL COMMENT '接口请求参数',
    `interface_assert` VARCHAR(255) DEFAULT NULL COMMENT '接口断言',
    `interface_return` VARCHAR(255) DEFAULT NULL COMMENT '接口返回值',

        PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '单一测试步骤';