package com.issue.issuemanagement.util;

import com.issue.issuemanagement.dto.ProjectDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;


public class TPage<T > implements Page<ProjectDto> {

    private int number;
    private int size;
    private Sort sort;
    private int totalPages;
    private Long totlElements;
    private List<T> content;

    public void setState(Page page, List<T> list){
        this.number = number;
        this.size = size;
        this.sort = sort;
        this.totalPages = totalPages;
        this.totlElements = totlElements;
        this.content = list;
    }

    @Override
    public int getTotalPages() {
        return 0;
    }

    @Override
    public long getTotalElements() {
        return 0;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public List<ProjectDto> getContent() {
        return null;
    }

    @Override
    public boolean hasContent() {
        return false;
    }

    @Override
    public Sort getSort() {
        return null;
    }

    @Override
    public boolean isFirst() {
        return false;
    }

    @Override
    public boolean isLast() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Pageable nextPageable() {
        return null;
    }

    @Override
    public Pageable previousPageable() {
        return null;
    }

    @Override
    public <U> Page<U> map(Function<? super ProjectDto, ? extends U> function) {
        return null;
    }

    @Override
    public Iterator<ProjectDto> iterator() {
        return null;
    }
}
