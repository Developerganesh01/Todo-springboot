package dev.ganeshm.todo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username")
})
public class User
{
    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, updatable = false)
    private String username;

    @NotBlank
    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    //constructors
    public User() {}

    public User(String username, String email, String password)
    {
        this.username = username.trim().toLowerCase();
        this.email = email.trim().toLowerCase();
        this.password = password.trim();
    }

    //getter and setter
    public Long getId(){return id;}

    public String getUsername() {return username;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email.trim();}
}
