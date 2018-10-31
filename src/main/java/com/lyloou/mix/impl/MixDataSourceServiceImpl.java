package com.lyloou.mix.impl;

import com.lyloou.mix.Mix;
import com.lyloou.mix.MixDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MixDataSourceServiceImpl implements MixDataSourceService {
    @Autowired
    DataSource dataSource;

    @Override
    public Mix getMix(Long id) {
        Mix mix = null;
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("select id, name, note from mix where id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mix = new Mix();
                mix.setId(rs.getLong("id"));
                mix.setName(rs.getString("name"));
                mix.setNote(rs.getString("note"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mix;
    }
}
