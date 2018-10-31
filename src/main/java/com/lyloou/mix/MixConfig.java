package com.lyloou.mix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@ImportResource({"classpath:mix.xml"})
public class MixConfig {
}
