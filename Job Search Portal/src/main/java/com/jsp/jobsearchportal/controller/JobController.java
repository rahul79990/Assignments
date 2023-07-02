package com.jsp.jobsearchportal.controller;

import com.jsp.jobsearchportal.model.Job;
import com.jsp.jobsearchportal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/jobs/getAll")
    public Iterable<Job> getAll()
    {
        return jobService.getAll();
    }

    @PostMapping("/jobs/add")
    public String addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }

    @GetMapping("/jobs/{id}")
    public Optional<Job> getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }

    @DeleteMapping("/jobs/delete/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }

    @GetMapping("/search/title")
    public List<Job> findByTitle(@RequestParam String title){
        return jobService.findByTitle(title);
    }

    @GetMapping("/search/desc")
    public List<Job> findByDescription(@RequestParam String description){
        return jobService.findByDescription(description);
    }

    @PutMapping("/jobs/update/{id}")
    public String updateById(@PathVariable Long id ,@Valid @RequestBody  Job job)
    {
        return jobService.updateById(id , job);
    }
}