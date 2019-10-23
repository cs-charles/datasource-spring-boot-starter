# datasource-spring-boot-starter
学习spring boot自动装配原理

# 测试
在IDEA的vm参数中添加 dbType=xx即可测试无法注册service的情况

# 如需要覆盖DefaultDataSourceService
- 更改dbType
- 实例化一个DataSourceServiceBean
