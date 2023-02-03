package study.datajpa.repository;

public class UsernameOnlyDto {
    private final String name;

    public UsernameOnlyDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
