package com.lyloou.mix.impl;

import com.lyloou.mix.Mix;
import com.lyloou.mix.MixDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import static com.lyloou.mix.MixUtil.getMixWith;

@Component
public class MixDataSourceServiceImpl implements MixDataSourceService {
    @Autowired
    DataSource dataSource;

    @Override
    public Mix getMix(Long id) {
        return getMixWith(dataSource, id);
    }
}
