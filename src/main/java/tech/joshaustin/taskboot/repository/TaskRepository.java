package tech.joshaustin.taskboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.joshaustin.taskboot.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
    Iterable<Task> findByProject(Integer projectId);
}
