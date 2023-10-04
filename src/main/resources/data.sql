INSERT INTO project (title, description) VALUES ('Taskboot', 'Feature and bug tracking for Taskboot');


INSERT INTO task (title, project) VALUES ('Project must contain tasks', 1);
INSERT INTO task (title, project) VALUES ('Tasks must contain a title', 1);
INSERT INTO task (title, description, project) VALUES ('Tasks must contain subtasks', 'Be careful with nesting objects!', 1);