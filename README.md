# 自动化工程
有多个模块，包括
1. web后端
2. server执行指定任务的模块（后续可拓展）
3. common模块，公共代码
4. agent，负责在服务器或环境中执行请求

## 注意
尽量使用成熟有维护的第三方工具
如
hutool
guava
apache-commons
等

## TODO
- 集成MQ（RocketMQ）
- 集成Redis
- 集成hutools，使用其工具
- 集成apache common 使用其工具
- 支持多数据源（Mysql等）-Druid线程池
- 支持RPC交互（Thrift接口）
- 如何在前后端中使用长链接
- 支持XXL Job
- 使用OkHttps发送HTTP请求（需要支持HTTPS）
- MapStruct相关依赖,替代BeanUtils