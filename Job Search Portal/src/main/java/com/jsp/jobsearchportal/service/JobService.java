package com.jsp.jobsearchportal.service;

import com.jsp.jobsearchportal.model.Job;
import com.jsp.jobsearchportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public Iterable<Job> getAll() {
        return jobRepository.findAll();
    }

    public String addJob(Job job) {
        jobRepository.save(job);
        return "Job Added";
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public String deleteJob(Long id) {
        jobRepository.deleteById(id);
        return "job deleted";
    }

    public List<Job> findByTitle(String title) {
        return jobRepository.findByTitle(title);
    }

    public List<Job> findByDescription(String description) {
        return jobRepository.findByDescription(description);
    }

    public String updateById(Long id , Job job) {
        Optional<Job> existingJobOptional = jobRepository.findById(id);
        if (existingJobOptional.isPresent()) {
            Job existingJob = existingJobOptional.get();
            existingJob.setTitle(job.getTitle());
            existingJob.setDescription(job.getDescription());
            existingJob.setLocation(job.getLocation());
            existingJob.setSalary(job.getSalary());
            existingJob.setCompanyEmail(job.getCompanyEmail());
            existingJob.setCompanyName(job.getCompanyName());
            existingJob.setEmployerName(job.getEmployerName());
            existingJob.setJobType(job.getJobType());
            existingJob.setAppliedDate(job.getAppliedDate());
            jobRepository.save(existingJob);
            return "Job updated with ID: " + existingJob.getId();
        } else {
            return "Job not found";
        }
    }
}

