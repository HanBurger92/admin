package com.hanburger.admin.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * xxl定时任务配置类<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 10:43
 */
@Configuration
@Slf4j
public class XxlJobConfig {

    @Value("${xxl.adminAddress}")
    private String adminAddress;

    @Value("${xxl.accessToken}")
    private String accessToken;

    @Value("${xxl.executor.appName}")
    private String appName;

    @Value("${xxl.executor.address}")
    private String address;

    @Value("${xxl.executor.ip}")
    private String ip;

    @Value("${xxl.executor.port}")
    private int port;

    @Value("${xxl.executor.logPath}")
    private String logPath;

    @Value("${xxl.executor.logRetentionDays}")
    private int logRetentionDays;

    @Bean
    public XxlJobSpringExecutor xxlJobSpringExecutor() {
        log.info(">>>>>>>>>>> xxl-job config init");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(adminAddress);
        xxlJobSpringExecutor.setAccessToken(accessToken);
        xxlJobSpringExecutor.setAppname(appName);
        xxlJobSpringExecutor.setIp(ip);
        xxlJobSpringExecutor.setPort(port);
        xxlJobSpringExecutor.setLogPath(logPath);
        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);

        return xxlJobSpringExecutor;
    }

}
