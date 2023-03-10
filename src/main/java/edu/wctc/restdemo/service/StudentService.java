package edu.wctc.restdemo.service;

import edu.wctc.restdemo.entity.Student;
import edu.wctc.restdemo.exception.ResourceNotFoundException;
import edu.wctc.restdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        studentRepository.findAll().forEach(list::add);
        return list;
    }
    public Student getStudent(int id) throws ResourceNotFoundException {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "ID", Integer.toString(id)));
    }
}
