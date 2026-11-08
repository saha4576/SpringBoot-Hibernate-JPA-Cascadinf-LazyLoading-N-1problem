package in.saha.Cascading.controller;

import in.saha.Cascading.model.Department;
import in.saha.Cascading.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
DepartmentService departmentService;

public DepartmentController(DepartmentService departmentService) {
    this.departmentService = departmentService;
}

@PostMapping
public ResponseEntity<String> createDepartment(
        @RequestBody Department department) {

    departmentService.createDepartment(department);
    return ResponseEntity.ok("DONE");
}

@DeleteMapping("/{id}")
public ResponseEntity<String> deleteDepartment(
        @PathVariable Long id) {

    departmentService.removeDepartment(id);
    return ResponseEntity.ok("DONE");
}
public class DepartmentController {
}
