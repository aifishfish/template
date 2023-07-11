package com.leon;

import cn.hutool.core.lang.Console;
import cn.hutool.system.SystemUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(BaseApplication.class, args);

        Console.log("============启动*成功============");
        Console.log("JAVA:\n {}", SystemUtil.getJavaInfo());
        Console.log("系统信息:\n {}",SystemUtil.getOsInfo());
        Console.log("网络地址信息:\n {}",SystemUtil.getHostInfo());
        Console.log("运行内存信息：\n {}",SystemUtil.getRuntimeInfo());
        Console.log("======666======running======666======\n" +
                "  \n");
    }

}
