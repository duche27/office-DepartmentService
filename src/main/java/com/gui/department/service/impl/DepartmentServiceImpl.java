package com.gui.department.service.impl;

import com.gui.department.exceptions.DeparmentNotFoundException;
import com.gui.department.model.Department;
import com.gui.department.repository.DepartmentRepository;
import com.gui.department.service.IDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements IDepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {

        log.info("Saving department: {}", department);

        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartment(Long id) {

        log.info("Retrieving departmentId: {}", id);

        return departmentRepository.findById(id)
                .orElseThrow(() -> new DeparmentNotFoundException("El departamento con id " + id + " no existe"));
    }
}
