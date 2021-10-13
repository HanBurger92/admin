package com.hanburger.admin.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * FF14 wiki页面爬虫<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 10:29
 */
public class FF14WIKIPageProcessor implements PageProcessor {

    // 抓取网站的相关配置
    private Site site = Site.me().setRetrySleepTime(3).setSleepTime(1000);

    // 定制爬虫逻辑的核心接口，在该函数编写抽取逻辑
    @Override
    public void process(Page page){
        // 定义如何抽取页面
        page.putField("target", page.getUrl().regex("regex").toString());
        page.putField("name", page.getHtml().xpath("regex").toString());
        if(page.getResultItems().get("name") == null){
            //skip this page
            page.setSkip(true);
        }

        // 从页面发现的后续的url地址来抓取
        page.addTargetRequests(page.getHtml().links().regex("regex").all());
    }

    @Override
    public Site getSite(){
        return site;
    }

}
