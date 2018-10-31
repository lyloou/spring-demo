package com.lyloou.mix;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MixUtil {
    public static Mix getMixWith(DataSource dataSource, Long id) {
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
