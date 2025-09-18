package de.gfn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {

    private final String text;
    private final LocalDate createdAt;
    private final boolean done;

    public Todo(String text) {
        this.text = text;
        this.createdAt = LocalDate.now();
        this.done = false;
    }

    public String getText() {
        return text;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "text='" + text + '\'' +
                ", createdAt=" + createdAt +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return done == todo.done && Objects.equals(text, todo.text) && Objects.equals(createdAt, todo.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, createdAt, done);
    }
}
