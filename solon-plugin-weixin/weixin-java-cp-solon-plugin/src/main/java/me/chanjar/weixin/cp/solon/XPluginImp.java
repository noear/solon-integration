package me.chanjar.weixin.cp.solon;

import org.noear.solon.core.AppContext;
import org.noear.solon.core.Plugin;
import me.chanjar.weixin.cp.solon.config.WxCpServiceAutoConfiguration;
import me.chanjar.weixin.cp.solon.config.storage.WxCpInMemoryConfigStorageConfiguration;
import me.chanjar.weixin.cp.solon.config.storage.WxCpInRedissonConfigStorageConfiguration;
import me.chanjar.weixin.cp.solon.properties.WxCpProperties;

public class XPluginImp implements Plugin{

	@Override
	public void start(AppContext context) throws Throwable {
        context.beanMake(WxCpProperties.class);
        context.beanMake(WxCpInMemoryConfigStorageConfiguration.class);
        context.beanMake(WxCpInRedissonConfigStorageConfiguration.class);
        context.beanMake(WxCpServiceAutoConfiguration.class);
	}

}
