package com.hanburger.admin.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

/**
 * FF14 wiki页面爬虫<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 10:29
 */
@Slf4j
@Component
public class FF14WIKIPageProcessor implements PageProcessor {

    // 抓取网站的相关配置
    private Site site = Site.me()
            .setRetrySleepTime(3)
            .setSleepTime(5000);

    // 定制爬虫逻辑的核心接口
    @Override
    public void process(Page page){

        // 页面内容 <html>...<html/>
        Html html = page.getHtml();

        // 将物品详细属性页面的链接提取出来
        log.info("开始获取物品详情页面url");
        List<String> urls = html.css("div.ff14-item-list--item").links().all();
        log.info("物品详情页面url获取结束，urls:{}", urls.toString());

        // 定义如何抽取页面信息
        page.putField("physicalDefense", html.css("div.stat-value only-value").toString());

        if(page.getResultItems().get("name") == null){
            //skip this page
            page.setSkip(true);
        }

        // 从页面发现的后续的url地址来抓取
        page.addTargetRequests(urls);
    }

    @Override
    public Site getSite(){
        return site;
    }

}
