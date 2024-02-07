package Spring.home5.Home5.API;

import Spring.home5.Home5.Repository.TaskRepository;
import Spring.home5.Home5.Task.Status;
import Spring.home5.Home5.Task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task createTask(Task task){
        return  repository.save(task);
    }
    public List<Task> getAllTask(){
        return repository.findAll();
    }
    public Task getTaskById(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task updateTask(Long id,Task task){
        Task currentTask = getTaskById(id);
        currentTask.setDescription(task.getDescription());
        currentTask.setDate(task.getDate());
        currentTask.setName(task.getName());
        currentTask.setStatus(task.getStatus());
        return currentTask;
    }
    public void deleteTask(Long id){
        repository.deleteById(id);
    }
    public List<Task> getTaskByStatus(Status status){
        return  getAllTask().stream().filter(task -> task.getStatus() == status ).collect(Collectors.toList());
    }
    public List<Task> getTaskByStats(Status status){
        return  repository.findByStatus(status);
    }

}
