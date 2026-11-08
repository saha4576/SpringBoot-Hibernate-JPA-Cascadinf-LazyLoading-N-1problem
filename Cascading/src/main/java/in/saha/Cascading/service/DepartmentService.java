package in.saha.Cascading.service;
import  in.saha.Cascading.model.Department;
import  in.saha.Cascading.model.Student;
import  in.saha.Cascading.repository.DepartmentRepository;
import  in.saha.Cascading.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    private StudentRepository studentRepository;

    public DepartmentService(DepartmentRepository departmentRepository,
                             StudentRepository studentRepository) {
        this.departmentRepository = departmentRepository;
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void createDepartment(Department department) {
//       Student s1 = new Student();
//       s1.setName("Aditya");
//       s1.setDepartment(department);
//
//       Student s2 = new Student();
//       s2.setName("Rohit");
//       s2.setDepartment(department);
//
//        Student s3 = new Student();
//        s3.setName("Rohan");
//        s3.setDepartment(department);
//
//        Student s4 = new Student();
//        s4.setName("Sonika");
//        s4.setDepartment(department);
//
//        department.getStudents().addAll(List.of(s1, s2, s3, s4));

        //departmentRepository.save(department);
//        studentRepository.save(s1);
//        studentRepository.save(s2);
//        studentRepository.save(s3);
//        studentRepository.save(s4);
    }


    @Transactional
    public void removeDepartment(Long deptId) {

        Department department =
                departmentRepository.findById(deptId);

        departmentRepository.removeDepartment(department);
    }
}
