package com.issue.issuemanagement.service;

import com.issue.issuemanagement.dto.IssueDto;
import com.issue.issuemanagement.entity.Issue;
import com.issue.issuemanagement.entity.IssueHistory;
import com.issue.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

}
