package spring.project01.restAPI_01.controller;

import org.springframework.web.bind.annotation.*;
import spring.project01.restAPI_01.dto.request.UserDTO;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping(value = "/")
    public String addUser( @RequestBody UserDTO userDto){

        System.out.println("User :"+ userDto.toString());
        return "Added user";
    }

    @PutMapping(value="/{userID}")
    public String updateValue( @PathVariable long userID){
        UserDTO user = new UserDTO(1l, "Nguyen Minh Duc", "email", false);
        System.out.println("User before update: "+ user.toString());

        if(userID == user.getUserID()){
            System.out.println("Updated UserID: "+ userID);
            user.setUserName("Duc");
            user.setEmail("deptrai@gmail.com");
            user.setState(true);
            System.out.println(user.toString());
            return "Updated user";
        }
        return "Don't find UserID "+userID;
    }

    @PatchMapping(value ="/{userID}")
    public String changeValue(@PathVariable long userID ,@RequestParam boolean state){
        UserDTO user = new UserDTO(1l, "Nguyen Minh Duc", "email", false);
        if(userID == user.getUserID()){
            user.setState(state);
            System.out.println(user.toString());
            return "Changed user";
        }
        return "Don't find userID : "+userID;
    }

    @DeleteMapping("/{userID}")
    public String removeUser(@PathVariable long userID){
        UserDTO user = new UserDTO(1l, "Nguyen Minh Duc", "email", false);
        System.out.println("User before remove: "+ user.toString());
        if(userID == user.getUserID()){
            user = new UserDTO();
            System.out.println(user.toString());
            return "Removed user";
        }
        return "Don't find userID : "+userID;

    }

    @GetMapping("/")
    public String getAll(){
        List<UserDTO> list = new ArrayList<>();
        list.add(new UserDTO(1L, "Duc", "duc@email.com", true));
        list.add(new UserDTO(2L, "Ha", "ha@email.com", false));

        System.out.println(list.toString());
        return "Getted list";
    }

    @GetMapping("/{userID}")
    public String getUser(@PathVariable long userID){
        UserDTO user = new UserDTO(1l, "Duc", "ducdeptrai@email.com", true);

        if(userID == user.getUserID()){
            System.out.println(user.toString());
            return "Getted user";
        }
        return "Don't find userID : " + userID;
    }
}
