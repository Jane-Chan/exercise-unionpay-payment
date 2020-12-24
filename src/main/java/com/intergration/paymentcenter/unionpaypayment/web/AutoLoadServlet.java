package com.intergration.paymentcenter.unionpaypayment.web;

import com.intergration.paymentcenter.unionpaypayment.sdk.SDKConfig;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 功能：从应用的classpath下加载acp_sdk.properties属性文件并将该属性文件中的键值对赋值到SDKConfig类中 <br>
 * 声明：以下代码只是为了方便接入方测试而提供的样例代码，商户可以根据自己需要，按照技术文档编写。该代码仅供参考，不提供编码，性能，规范性等方面的保障
 */
@Component
public class AutoLoadServlet implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		SDKConfig.getConfig().loadPropertiesFromSrc();
	}
}
