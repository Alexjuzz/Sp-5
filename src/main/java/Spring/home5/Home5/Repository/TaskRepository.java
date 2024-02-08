package Spring.home5.Home5.Repository;

import Spring.home5.Home5.Task.Status;
import Spring.home5.Home5.Task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
        List<Task> findByStatus(Status status);

        Task findByName(String name);


}
