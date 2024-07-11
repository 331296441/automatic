drop table if exists `test_case_step`;

CREATE TABLE `test_case_step` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `step_type` int(2) not null comment '默认类型 0 HTTP接口 1 Web UI 2 API驱动  3移动端',
    
        PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COMMENT = '单一测试步骤';