/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassgnment;

/**
 *
 * @author SONY
 */
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//public class ReadFile {
    
    public class ReadFile {
 
    public static void main(String args[]) throws IOException{

 int i = 1;
 Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
 SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(reader);
 SqlSession session = sql.openSession();

 //select a particular student by rollno
 Student student = (Student)
session.selectOne("Student.getByrollno", 101);
 
 //Print the student details
 System.out.println(student.getrollno());
 System.out.println(student.getname());
 System.out.println(student.getMarks());
 System.out.println(student.getpercentage());

 session.commit();
 session.close();
 }

}

