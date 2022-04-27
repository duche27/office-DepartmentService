package com.gui.department.service;

import com.gui.department.model.Department;
import org.springframework.stereotype.Service;

@Service
public interface IDepartmentService {
    Department saveDepartment(Department department);

    Department getDepartment(Long id);
}
