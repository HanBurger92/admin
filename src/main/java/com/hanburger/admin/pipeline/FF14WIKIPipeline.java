package com.hanburger.admin.pipeline;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * FF14维基爬虫数据处理类<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 17:09
 */
@Service
@Slf4j
public class FF14WIKIPipeline implements Pipeline {

    @Override
    public void process(ResultItems result, Task task){

    }
}
