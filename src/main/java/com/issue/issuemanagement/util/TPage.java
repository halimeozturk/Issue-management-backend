package com.issue.issuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T > {

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
}
