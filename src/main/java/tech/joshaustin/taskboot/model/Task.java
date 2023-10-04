package tech.joshaustin.taskboot.model;

import jakarta.annotation.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("task")
public record Task(@Id Integer id, String title, @Nullable String description, Integer project) {
}
