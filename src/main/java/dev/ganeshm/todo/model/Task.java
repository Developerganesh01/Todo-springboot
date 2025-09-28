package dev.ganeshm.todo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "tasks")
public class Task
{
    //fields
    @Id
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String topic;

    @NotEmpty
    @Column(nullable = false)
    private String description;

    //getters and setters
    public Long getId(){return id;}

    public String getTopic(){return this.topic;}

    public void setTopic(String topic) {this.topic = topic.trim();}

    public String getDescription() {return this.description;}

    public void setDescription(String description) {this.description= description.trim();}
}
