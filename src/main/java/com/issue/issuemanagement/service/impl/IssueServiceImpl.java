package com.issue.issuemanagement.service.impl;

import com.issue.issuemanagement.dto.IssueDto;
import com.issue.issuemanagement.entity.Issue;
import com.issue.issuemanagement.repository.IssueRepository;
import com.issue.issuemanagement.service.IssueService;
import com.issue.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final  IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper){
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate() == null){
            throw new IllegalArgumentException("Issue date cannot be null");
        }
        Issue issueDb =  modelMapper.map(issue,Issue.class);
        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
       Page<Issue> data = issueRepository.findAll(pageable);
       TPage page = new TPage<IssueDto>();
       IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
       page.setState(data, Arrays.asList(dtos));
       return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
