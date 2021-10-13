package com.hanburger.admin.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 网络工具类<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 18:22
 */
@Component
public class NetworkUtil {

    /**
     * IP代理池，防反爬虫机制
     * @return
     */
    public List<String> ipProxyPool(){
        return new ArrayList<>();
    }
}
