Eureka+ feign 服务注册与调用
包含三个角色:服务中心 服务提供者 服务使用者
注册中心项目:只添加了一个依赖[spring-cloud-starter-netflix-eureka-server]
使用@EnableEurekaServer注解,配置Eureka相关配置和应用名 启动端口

服务提供者(EurekaProducer):添加spring-boot-starter-web和spring-cloud-starter-netflix-eureka-client依赖 提供服务并注册到注册中心里面以及EurekaDiscoveryClient依赖
1.添加依赖
2.修改配置文件
3.修改入口启动类:添加@EnableDiscoveryClient注解
4.新增一个Controller,写一个访问接口
5.启动项目并测试

服务消费者(EurekaConsumer):添加spring-boot-starter-web spring-cloud-starter-netflix-eureka-client OpenFeign依赖
1.添加依赖
2.修改配置文件
3.修改入口启动类:添加@EnableEurekaClient注解, 添加@EnableFeignClients //标记 feign 的客户端
4.新增一个Service,写一个userOrder访问接口:在接口中远程调用(注入)上面提供的服务,使用@FeignClient(value = "EurekaProducer")注解 value的值是远程服务名
5.启动项目并测试
调用总结:
EurekaConsumer---》 /userDoOrder ---》通过feign 调用 /doTest---》EurekaProducer的对应方法调用成功






