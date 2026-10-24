# TwelveT Fast

基于 Spring Boot 3.5 + JDK 17 的 twelvet 单体后台服务，包含系统管理、代码生成、定时任务、文件存储等模块。

## 环境要求

- JDK 17+
- Maven 3.8+
- MySQL 8+、Redis 6+

## 快速开始

### 1. 初始化数据库

创建数据库 `twelvet-fast`，导入 `data/twelvet.sql`。

### 2. 配置连接

连接信息全部通过环境变量读取，未设置时使用括号内默认值：

| 变量 | 说明 | 默认值 |
| --- | --- | --- |
| `MYSQL_HOST` | MySQL 主机 | `192.168.124.200` |
| `MYSQL_PORT` | MySQL 端口 | `30000` |
| `MYSQL_ROOT_USER` | MySQL 用户名 | `root` |
| `MYSQL_ROOT_PASSWORD` | MySQL 密码 | `wang13587` |
| `REDIS_HOST` | Redis 主机 | `192.168.124.200` |
| `REDIS_PORT` | Redis 端口 | `30001` |
| `REDIS_PASSWORD` | Redis 密码 | `wang13587` |

其余配置见 `twelvet-admin/src/main/resources/application.yml`。

### 3. 启动

```bash
mvn clean package -DskipTests
java -jar twelvet-admin/target/twelvet-admin*.jar
```

开发时可只启动入口模块：

```bash
mvn spring-boot:run -pl twelvet-admin
```

服务端口 `8080`，访问路径 `/`。

### 4. 默认账号

`admin` / `123456`

## 接口文档

- Knife4j：http://localhost:8080/doc.html
- OpenAPI：http://localhost:8080/v3/api-docs

## 鉴权

基于 Sa-Token，token 通过请求头 `Authorization: Bearer <token>` 传递。

```bash
# 登录
curl -X POST http://localhost:8080/auth/oauth2/token \
  -H 'Content-Type: application/json' \
  -d '{"username":"admin","password":"123456"}'

# 退出
curl -X DELETE http://localhost:8080/auth/token/logout -H 'Authorization: Bearer <token>'
```

## 模块结构

| 模块 | 说明 |
| --- | --- |
| `twelvet-admin` | 启动入口，Web 服务与登录接口 |
| `twelvet-framework` | 基础设施：core / security / redis / datasource / jdbc / log / datascope / swagger / utils |
| `twelvet-system` | 系统管理：用户、角色、菜单、部门、字典、日志、国际化 |
| `twelvet-gen` | 基于数据库表的代码生成器（Velocity 模板） |
| `twelvet-quartz` | 定时任务 |
| `twelvet-dfs` | 文件存储，基于 S3 协议的 OSS |
| `twelvet-study` | 自习室座位预约（微信小程序），待开发 |

## 技术栈

Spring Boot 3.5、Sa-Token、MyBatis + PageHelper + dynamic-datasource、Redisson、Knife4j / SpringDoc、Hutool、Velocity、EasyExcel、pig4cloud oss-spring-boot-starter。

## 代码规范

代码格式由 spring-javaformat 统一，提交前执行：

```bash
mvn spring-javaformat:apply
```

## 开源协议

[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
