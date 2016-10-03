package io.github.jhipster.sample.service;

import io.github.jhipster.sample.domain.Job;
import io.github.jhipster.sample.repository.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Job.
 */
@Service
@Transactional
public class JobService {

    private final Logger log = LoggerFactory.getLogger(JobService.class);
    
    @Inject
    private JobRepository jobRepository;

    /**
     * Save a job.
     *
     * @param job the entity to save
     * @return the persisted entity
     */
    public Job save(Job job) {
        log.debug("Request to save Job : {}", job);
        Job result = jobRepository.save(job);
        return result;
    }

    /**
     *  Get all the jobs.
     *  
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public List<Job> findAll() {
        log.debug("Request to get all Jobs");
        List<Job> result = jobRepository.findAllWithEagerRelationships();

        return result;
    }

    /**
     *  Get one job by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public Job findOne(Long id) {
        log.debug("Request to get Job : {}", id);
        Job job = jobRepository.findOneWithEagerRelationships(id);
        return job;
    }

    /**
     *  Delete the  job by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Job : {}", id);
        jobRepository.delete(id);
    }
}
