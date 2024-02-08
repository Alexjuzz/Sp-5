package Spring.home5.Home5.Task;



import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Tasks")
public class Task {
        public Task(String name, String description) {
                this.name = name;
                this.description = description;
                onCreate();
        }

        public Task() {
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String description;
        @Column(name = "Date start",nullable = false)
        private Date date;
        @Enumerated(EnumType.STRING)

        private Status status;


        @PrePersist
        protected void onCreate() {
                date = new Date();
                status = Status.NOT_STARTED;
        }

        public Status getStatus() {
                return status;
        }

        public void setStatus(Status status) {
                this.status = status;
        }

        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }
}
