package com.example.configserver;
//http://blog.csdn.net/ssrc0604hx/article/details/52802392
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
在spring cloud config 组件中，分两个角色，一是config server，二是config client。
 */

@SpringBootApplication
@EnableConfigServer   //@EnableConfigServer注解开启配置服务器的功能
public class ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
/*启动程序：访问http://localhost:8888/foo/dev
显示json证明证明配置服务中心可以从远程程序获取配置信息。
*/