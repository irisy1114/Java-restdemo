package edu.wctc.restdemo.controller;

import edu.wctc.restdemo.entity.Student;
import edu.wctc.restdemo.exception.ResourceNotFoundException;
import edu.wctc.restdemo.repository.StudentRepository;
import edu.wctc.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/api/students/{studentId}")
    public Student getStudent(@PathVariable String studentId) {
        try {
            int id = Integer.parseInt(studentId);
            Student student = studentService.getStudent(id);
            return student;
        } catch (NumberFormatException nfe) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Student ID param must be an integer");
        }
        catch (ResourceNotFoundException rnfe) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, rnfe.getMessage(), rnfe);
        }
    }
}
