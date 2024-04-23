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

## TODO
- 集成MQ（RocketMQ）
- 集成Redis
- 支持多数据源（Mysql等）
- 支持RPC交互（Thrift接口）
- 支持XXL Job
- 使用OkHttps发送HTTP请求（需要支持HTTPS）