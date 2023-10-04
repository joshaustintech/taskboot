package tech.joshaustin.taskboot.model;

import jakarta.annotation.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("project")
public record Project(@Id Integer id, String title, @Nullable String description) {
}
