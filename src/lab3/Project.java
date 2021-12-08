package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Project {
    private String projectName;
    private List<Worker>workerList;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> list_1) {
        this.workerList = workerList;
    }

    public static class Builder {
        private Project newProject;

        public Builder() {
            newProject = new Project();
        }

        public Builder withProjectName(String name){
            newProject.projectName = name;
            return this;
        }

        public Builder withWorkerList(List<Worker> list){
            newProject.workerList = list;
            return this;
        }

        public Project build(){
            return newProject;
        }

    }

    public List<Worker> sortBySurnames() {
        workerList.sort(new WorkerComparator());
        return workerList;
    }

    public List<Worker> sortBySurnamesStream() {
        return workerList.stream().sorted(new WorkerComparator()).toList();
    }

    public List<Worker> filter(List<Worker> list, String name){

        for(int i = list.size()-1; i >=0 ;i--){
            if(list.get(i).getName() == name) {
                list.remove(i);
            }
        }
        return list;
    }

    public List<Worker> filterStream(List<Worker> list, String name) {
        return list.stream().filter(a -> a.getName() != name).toList();
    }

    public List<Worker> getWorkerListOfAge(int age) {
        List<Worker> res = new ArrayList<Worker>();
        for (var anm : workerList) {
            if (anm.getAge() == age) {
                res.add(anm);
            }
        }
        return res;
    }

    public List<Worker> getWorkerListOfAgeStream(int Age) {
        return workerList.stream().filter(a->a.age == Age).toList();
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", workerList=" + workerList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return projectName.equals(project.projectName) && workerList.equals(project.workerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, workerList);
    }
}
