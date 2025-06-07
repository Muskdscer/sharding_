package com.example.shardingsphere;

import com.example.shardingsphere.domain.po.Student;
import com.example.shardingsphere.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingApplicationTests {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        Student student = new Student(2L, "测试2");
        studentMapper.insert(student);
    }

    @Test
    void test() {
        Student stu1 = studentMapper.selectById(1);
        Student stu2 = studentMapper.selectById(1);
        Student stu3 = studentMapper.selectById(1);
        Student stu4 = studentMapper.selectById(1);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
