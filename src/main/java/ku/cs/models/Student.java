package ku.cs.models;

public class Student {
    private String id;
    private String name;
    private String nickName;

    public Student(String id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}
