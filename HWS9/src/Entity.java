public class Entity {
    private String name;
    private String job;
    private String id;
    private String age;

    public String getId() {
        return id;
    }

    public Entity setId(String id) {
        this.id = id;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Entity setAge(String age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public String getJob() {
        return job;
    }

    public Entity setJob(String job) {
        this.job = job;
        return this;
    }

}
