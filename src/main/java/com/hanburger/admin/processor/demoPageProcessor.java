package com.hanburger.admin.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

/**
 * demo页面处理类<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/14 11:07
 */
@Component
@Slf4j
public class demoPageProcessor implements PageProcessor {

    // 抓取网站的相关配置
    private Site site = Site.me()
            .setRetrySleepTime(3)
            .setSleepTime(5000);

    // 定制爬虫逻辑的核心接口
    @Override
    public void process(Page page){
        // 页面内容 <html>...<html/>
        Html html = page.getHtml();
        page.putField("testGetContent", html.css("div.book-body").toString());
        page.putField("testGetLink", html.css("div.book-body").links().all());
        ResultItems resultItems = page.getResultItems();
        System.out.println(resultItems.get("testGetContent").toString());
        List<String> urls = resultItems.get("testGetLink");
        urls.forEach(System.out::println);
    }

    @Override
    public Site getSite(){
        return site;
    }
}
