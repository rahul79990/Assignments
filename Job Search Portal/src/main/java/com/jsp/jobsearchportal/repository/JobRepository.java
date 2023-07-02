package com.jsp.jobsearchportal.repository;

import com.jsp.jobsearchportal.model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job , Long> {

    List<Job> findByTitle(String title);

    List<Job> findByDescription(String description);
}
