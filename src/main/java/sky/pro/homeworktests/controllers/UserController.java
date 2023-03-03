//package sky.pro.homeworktests.controllers;
//
//import org.springframework.web.bind.annotation.*;
//import sky.pro.homeworktests.services.UserService;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/add")
//    public String add(@RequestParam String name){
//        return userService.add(name);
//    }
//    @GetMapping("/find")
//    public String find(@RequestParam String name){
//        return userService.find(name);
//    }
//    @PutMapping("/remove")
//    public String remove(@RequestParam String name){
//        return userService.remove(name);
//    }
//}
