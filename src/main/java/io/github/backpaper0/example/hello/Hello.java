package io.github.backpaper0.example.hello;

/**
 * Hello
 *
 */
public class Hello {
    /**
     * Greeting phrase template
     */
    private final String template;
    /**
     * Instantiate.
     */
    public Hello() {
        this("Hello, %s!");
    }
    /**
     * Instantiate.
     * @param template Greeting phrase template
     */
    public Hello(String template) {
        this.template = template;
    }
    /**
     * Say hello.
     * @return message
     */
    public String greeting() {
        return greeting("world");
    }
    /**
     * Say hello.
     * @param name Your name
     * @return message
     */
    public String greeting(String name) {
        return template.formatted(name);
    }
}

