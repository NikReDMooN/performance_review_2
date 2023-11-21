package java_4_11_10;

import org.springframework.web.bind.annotation.*;

public class example {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Long id(@RequestBody User user) {
        return user.id;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String variableId(@PathVariable String id) {
        return "ID = " + id;
    }

    @RequestMapping(value = "/param", method = RequestMethod.GET)
    public String id(@RequestParam String user) {
        return "USER = " + user;
    }

}
