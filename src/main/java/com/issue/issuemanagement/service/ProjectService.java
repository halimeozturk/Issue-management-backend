package com.issue.issuemanagement.service;

import com.issue.issuemanagement.dto.ProjectDto;
import com.issue.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto projectDto);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List <ProjectDto> getByProjectCodeContains(String projectCode);

    Page<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto projectDto);

    ProjectDto update(Long id, ProjectDto projectDto);
}
