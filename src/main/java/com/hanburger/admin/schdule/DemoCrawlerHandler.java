package com.hanburger.admin.schdule;

import com.hanburger.admin.processor.FF14WIKIPageProcessor;
import com.hanburger.admin.processor.demoPageProcessor;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;

/**
 * demo爬虫类<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/14 10:59
 */
@Component
@Slf4j
public class DemoCrawlerHandler {

    // demo爬虫启动定时任务
    @XxlJob("demoCrawlerHandler")
    public ReturnT<String> execute(String param) throws Exception {
        Spider.create(new demoPageProcessor())
                .addUrl("https://github.com/search?l=Java&p=1&q=stars%3A%3E1&s=stars&type=Repositories")
//                .addPipeline(new JsonFilePipeline())
                .thread(1)
                .run();
        return ReturnT.SUCCESS;
    }
}
