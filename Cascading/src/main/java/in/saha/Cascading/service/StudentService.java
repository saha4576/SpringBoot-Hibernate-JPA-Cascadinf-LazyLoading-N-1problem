package in.saha.Cascading.service;
import in.saha.Cascading.model.Department;
import in.saha.Cascading.model.Profile;
import in.saha.Cascading.model.Student;
import in.saha.Cascading.repository.DepartmentRepository;
import in.saha.Cascading.repository.ProfileRepository;
import in.saha.Cascading.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;
    DepartmentRepository departmentRepository;
    ProfileRepository profileRepository;

    public StudentService(StudentRepository studentRepository,
                          DepartmentRepository departmentRepository,
                          ProfileRepository profileRepository) {

        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
        this.profileRepository = profileRepository;
    }

    @Transactional
    public void createStudent(Student student) {

        Department department = new Department();
        department.setName("CSE");

        Profile profile = new Profile();
        profile.setBio("Simple Bio");

        student.setDepartment(department);
        student.setProfile(profile);

        departmentRepository.save(department);
        profileRepository.save(profile);
        studentRepository.save(student);
    }

    public Student fetchStudentById(Long id) {
        Student s1 =  studentRepository.findById(id);

        System.out.println("Lazily fetched Student");

        Department d1 = s1.getDepartment();

        System.out.println("Lazily fetched Department");

        Profile p1 = s1.getProfile();

        System.out.println("Lazily fetched Profile");

        return s1;
    }

}
