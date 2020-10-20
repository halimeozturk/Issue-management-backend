package com.issue.issuemanagement.repository;

import com.issue.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
