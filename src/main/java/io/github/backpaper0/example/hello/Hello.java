package io.github.backpaper0.example.hello;

/**
 * Hello
 *
 */
public class Hello {
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
        return "Hello, " + name + "!";
    }
}

