package com.hanburger.admin.schdule;

import com.hanburger.admin.processor.FF14WIKIPageProcessor;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

/**
 * 爬虫启动定时任务<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 10:57
 */
@Component
@Slf4j
public class CrawlerHandler {

    // FF14 WIKI 爬虫启动
    @XxlJob("FF14WIKICrawlerHandler")
    public ReturnT<String> FF14WIKICrawlerHandler(String param) throws Exception {
        Spider.create(new FF14WIKIPageProcessor())
                .addUrl("ff14wiki")
                .thread(5)
                .run();
        return ReturnT.SUCCESS;
    }

    // FF14 幻化站 爬虫启动
    @XxlJob("FF14TransCrawlerHandler")
    public ReturnT<String> FF14TransCrawlerHandler(String param) throws Exception {

        return ReturnT.SUCCESS;
    }
}
