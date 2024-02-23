package suai.labs.spring.transport.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import suai.labs.spring.transport.service.user.User;
import suai.labs.spring.transport.service.user.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    private UserService service;

    public UserRestController(UserService service) {
        this.service = service;
    }

    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> getAll() {
        return this.service.getAll();
    }
}
