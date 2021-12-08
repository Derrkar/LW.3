package lab3;

import java.util.Objects;

public class Worker implements Comparable<Worker> {
    protected String name;
    protected String surName;
    protected String middleName;
    protected String phoneNumber;
    protected String dateOfBirth;
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Worker o) {
        return surName.compareTo(o.surName);
    }


    public static class Builder {
        private Worker newWorker;

        public Builder() {
            newWorker = new Worker();
        }

        public Builder withName(String name) {
            newWorker.name = name;
            return this;
        }

        public Builder withSurname(String surName) {
            newWorker.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            newWorker.middleName = middleName;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            newWorker.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withDateOfBirth(String dateOfBirth) {
            newWorker.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withAge(int age) {
            newWorker.age = age;
            return this;
        }

        public Worker build() {
            return newWorker;
        }

    }

    @Override
    public String toString() {
        return surName + " " + name + " " + middleName + " " + age + " " + dateOfBirth + " " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name) && Objects.equals(surName, worker.surName) && Objects.equals(middleName, worker.middleName) && Objects.equals(phoneNumber, worker.phoneNumber) && Objects.equals(dateOfBirth, worker.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, middleName, phoneNumber, dateOfBirth, age);
    }
}
