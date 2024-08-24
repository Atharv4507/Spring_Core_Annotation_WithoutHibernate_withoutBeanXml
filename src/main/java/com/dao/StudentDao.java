package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.model.StudentRowMapper;
@Component
public class StudentDao {
    @Autowired
    private JdbcTemplate j;
    public int insertStudent(Student s1){
        String sql= "insert into Student(sname,scity,spercentage) values(?,?,?)";
        return j.update(sql, new Object[]{s1.getSname(),s1.getScity(),s1.getSpercentage()});
    }
    public int deleteStudent(int sid){
        String sql = "delete from student where sid=?";
        return j.update(sql, sid);
    }

    public Student findStudentById(int sid){
        String sql = "select sid,sname,scity,spercentage from student where sid=?";
        List<Student> stu = j.query(sql, new StudentRowMapper(), sid);
        return (!stu.isEmpty()? stu.get(0):null);
    }
    public List<Student> findAllStudents(){
        String sql = "select * from Student";
        return (j.query(sql, new StudentRowMapper()));
    }
}
