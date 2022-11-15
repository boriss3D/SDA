package patterns.exercises.task05;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Dog {
    private final String name;
    private final String type;
    private final Integer age;
    private final List<String> toys;

    private Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys = new ArrayList<>();

        public Builder withName(final String name) {
            this.name = name;
            return this;
        }
        public Builder withType(final String type) {
            this.type = type;
            return this;
        }
        public Builder withAge(final Integer age) {
            this.age = age;
            return this;
        }
        public Builder withToys(final List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name, type, age, toys);
        }
    }
}
