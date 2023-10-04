package tech.joshaustin.taskboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tech.joshaustin.taskboot.model.Project;
import tech.joshaustin.taskboot.model.Task;
import tech.joshaustin.taskboot.repository.ProjectRepository;
import tech.joshaustin.taskboot.repository.TaskRepository;

import java.util.HashMap;

@Controller()
public class HomeController {

    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    public HomeController(ProjectRepository projectRepository, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/")
    public ModelAndView home() {
        var fullProjectList = new HashMap<Project, Iterable<Task>>();
        var projects = projectRepository.findAll();
        for (Project project : projects) {
            fullProjectList.put(project, null);
            var tasks = taskRepository.findByProject(project.id());
            fullProjectList.put(project, tasks);
        }
        return new ModelAndView("home", "fullProjectList", fullProjectList);
    }

}
