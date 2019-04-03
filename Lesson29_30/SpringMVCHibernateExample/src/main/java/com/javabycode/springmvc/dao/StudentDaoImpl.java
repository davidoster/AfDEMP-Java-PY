package com.javabycode.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javabycode.springmvc.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Integer, Student> implements StudentDao {

        @Override
	public Student findById(int id) {
		return getByKey(id);
	}

        @Override
	public void saveStudent(Student student) {
		persist(student);
	}
	
        @Override
	public void saveOrUpdate(Student student){
		super.saveOrUpdate(student);
	}
	
        @Override
	public void deleteStudentByCode(String code) {
		Query query = getSession().createSQLQuery("delete from Student where code = :code");
		query.setString("code", code);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
        @Override
	public List<Student> findAllStudents() {
		Criteria criteria = createEntityCriteria();
		return (List<Student>) criteria.list();
	}

        @Override
	public Student findStudentByCode(String code) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("code", code));
		return (Student) criteria.uniqueResult();
	}
}
