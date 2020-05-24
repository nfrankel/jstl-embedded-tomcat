package ch.frankel.blog;

public class Foo {

    private final Long id;
    private final String name;

    public Foo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
