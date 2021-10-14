package com.hanburger.admin.schdule;

import com.hanburger.admin.processor.FF14TransPageProcessor;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;

/**
 * FF14幻化站爬虫<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/14 11:28
 */
@Component
@Slf4j
public class FF14TransCrawlerHandler {

    // FF14 幻化站爬虫启动定时任务
    @XxlJob("FF14TransCrawlerHandler")
    public ReturnT<String> FF14TransExecute(String param) throws Exception {
        Spider.create(new FF14TransPageProcessor())
                .addUrl("ff14trans")
                .addPipeline(new JsonFilePipeline())
                .thread(5)
                .run();
        return ReturnT.SUCCESS;
    }
}
