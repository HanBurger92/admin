package com.hanburger.admin.processor;

import com.hanburger.admin.schdule.DemoCrawlerHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;

import javax.annotation.Resource;

/**
 * 页面抽取测试<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/14 11:02
 */
@SpringBootTest
@Slf4j
public class PageExtractTest {

    @Resource
    private FF14WIKIPageProcessor pageProcessor;

    @Resource
    private DemoCrawlerHandler demoCrawlerHandler;

    @Test
    public void testPageExtract(){
        Page page = new Page();
//        page.setUrl();
//        pageProcessor.process();
    }

    @Test
    public void spiderTest() throws Exception{
        Spider.create(new demoPageProcessor())
                .addUrl("http://webmagic.io/docs/zh/posts/ch4-basic-page-processor/selectable.html")
//                .addPipeline(new JsonFilePipeline())
                .thread(1)
                .run();
    }

}
