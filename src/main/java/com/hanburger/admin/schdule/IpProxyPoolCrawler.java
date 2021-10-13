package com.hanburger.admin.schdule;

import com.hanburger.admin.processor.FF14WIKIPageProcessor;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;

/**
 * IP代理池爬虫<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 18:26
 */
@Component
@Slf4j
public class IpProxyPoolCrawler {

    // FF14 WIKI爬虫启动定时任务
    @XxlJob("FF14WIKICrawlerHandler")
    public ReturnT<String> FF14WIKICrawlerHandler(String param) throws Exception {
        Spider.create(new FF14WIKIPageProcessor())
                .addUrl("IpProxyPool")
                .addPipeline(new JsonFilePipeline())
                .thread(5)
                .run();
        return ReturnT.SUCCESS;
    }
}
