drop table if exists `test_case_step_interface`;

CREATE TABLE `test_case_step_interface` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `step_type` int(2) not null comment '默认类型 0 HTTP接口 1 Web UI 2 API驱动  3移动端',
    `desc`

        PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '单一测试步骤';