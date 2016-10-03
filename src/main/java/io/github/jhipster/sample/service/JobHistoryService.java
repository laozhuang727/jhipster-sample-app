package io.github.jhipster.sample.service;

import io.github.jhipster.sample.domain.JobHistory;
import io.github.jhipster.sample.repository.JobHistoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing JobHistory.
 */
@Service
@Transactional
public class JobHistoryService {

    private final Logger log = LoggerFactory.getLogger(JobHistoryService.class);
    
    @Inject
    private JobHistoryRepository jobHistoryRepository;

    /**
     * Save a jobHistory.
     *
     * @param jobHistory the entity to save
     * @return the persisted entity
     */
    public JobHistory save(JobHistory jobHistory) {
        log.debug("Request to save JobHistory : {}", jobHistory);
        JobHistory result = jobHistoryRepository.save(jobHistory);
        return result;
    }

    /**
     *  Get all the jobHistories.
     *  
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public List<JobHistory> findAll() {
        log.debug("Request to get all JobHistories");
        List<JobHistory> result = jobHistoryRepository.findAll();

        return result;
    }

    /**
     *  Get one jobHistory by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public JobHistory findOne(Long id) {
        log.debug("Request to get JobHistory : {}", id);
        JobHistory jobHistory = jobHistoryRepository.findOne(id);
        return jobHistory;
    }

    /**
     *  Delete the  jobHistory by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete JobHistory : {}", id);
        jobHistoryRepository.delete(id);
    }
}
