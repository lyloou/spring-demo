package com.lyloou;

import com.lyloou.mix.Mix;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mix.xml");
        JdbcTemplate template = ctx.getBean(JdbcTemplate.class);
        int id = 1;
        String sql = "select * from mix where id = " + id;
        Mix o = template.queryForObject(sql, (resultSet, i) -> {
            long id1 = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String note = resultSet.getString("note");
            Mix mix = new Mix();
            mix.setNote(note);
            mix.setName(name);
            mix.setId(id1);
            return mix;
        });
        assert o.getName().equals("name1");
    }
}
