package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {

    @Test
    public void implementer() {
        ArrayList<Student> students=new ArrayList<Student>();
        Student student1=new Student("abc","sab",1);
        Student student2=new Student("def","yas",2);
        Student student3=new Student("ghi","sac",2);
        Student student4=new Student("jkl","his",3);
        Student student5=new Student("mno","sah",4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        String result=MainTest.implementer(students);
        assertEquals("[Student{id='abc', name='sab', age=1}, Student{id='ghi', name='sac', age=2}, Student{id='def'," +
                " name='yas', age=2}, Student{id='jkl', name='his', age=3}, Student{id='mno', name='sah', age=4}]",result);
    }

    @Test
    public void implementer2() {
        ArrayList<Student> students=new ArrayList<Student>();
        Student student1=new Student("abc","sab",1);
        Student student2=new Student("def","yas",2);
        Student student3=new Student("ghi","his",2);
        Student student4=new Student("jkl","his",2);
        Student student5=new Student("mno","sah",4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        String result=MainTest.implementer(students);
        assertNotEquals("[Student{id='abc', name='sab', age=1}, Student{id='ghi', name='sac', age=2}, Student{id='def'," +
                " name='yas', age=2}, Student{id='jkl', name='his', age=3}, Student{id='mno', name='sah', age=4}]",result);
        assertEquals("[Student{id='abc', name='sab', age=1}, Student{id='ghi', name='his', age=2}, Student{id='jkl'," +
                " name='his', age=2}, Student{id='def', name='yas', age=2}, Student{id='mno', name='sah', age=4}]",result);
    }
}