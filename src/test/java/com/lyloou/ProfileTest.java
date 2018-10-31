package com.lyloou;

import com.lyloou.mix.MixUtil;
import com.lyloou.profile.ProfileConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("test")
//@ActiveProfiles("dev")
public class ProfileTest {
    Logger logger = Logger.getLogger(ProfileConfig.class);
    @Autowired
    private DataSource dataSource;

    @Test
    public void test() {
        logger.info("=====================================");
        logger.info(MixUtil.getMixWith(dataSource, 1L));
        logger.info("=====================================");
    }
}
