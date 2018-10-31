package com.lyloou;

import com.lyloou.mix.MixConfig;
import com.lyloou.mix.MixDataSourceService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MixTest {
    @Test
    public void testMix() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MixConfig.class);
        MixDataSourceService bean = context.getBean(MixDataSourceService.class);
        System.out.println(bean.getMix(1L));
    }
}
