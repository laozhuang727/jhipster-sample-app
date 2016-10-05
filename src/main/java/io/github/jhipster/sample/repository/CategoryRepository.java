package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.Category;

import io.github.jhipster.sample.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Category entity.
 */
@SuppressWarnings("unused")
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("select c from Category c where c.parentCategory.id = :categoryId")
    List<Category> getAllSubCategories(@Param("categoryId") Long categoryId);

    @Query("select c from Category c where c.parentCategory.id is null")
    List<Category> getAllFirstLevelCategories();
}
