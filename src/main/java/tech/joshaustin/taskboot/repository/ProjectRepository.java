package tech.joshaustin.taskboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.joshaustin.taskboot.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
