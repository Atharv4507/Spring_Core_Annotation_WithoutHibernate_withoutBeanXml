package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s1 = new Student();
        s1.setSid(rs.getInt("sid"));
        s1.setSname(rs.getString("sname"));
        s1.setScity(rs.getString("scity"));
        s1.setSpercentage(rs.getDouble("spercentage"));
        return s1;
    }
    
}
