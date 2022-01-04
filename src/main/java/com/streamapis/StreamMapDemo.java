package com.streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapDemo {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "John@123", "john123@gmail.com"));
        users.add(new User(2, "Joe", "Joe@123", "joe123@gmail.com"));
        users.add(new User(3, "Jerry", "Jerry@123", "jerry123@gmail.com"));
        users.add(new User(4, "Tom", "Tom@123", "tom123@gmail.com"));

        List<UserDTO> userDTO = new ArrayList<>();
        for (User user : users) {
            userDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for (UserDTO dto : userDTO) {
            System.out.println(dto);
        }

        // Using stream().map()
        users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                      .forEach((userDTO1 -> System.out.println(userDTO1)));
//        users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
//                .collect(Collectors.toList()).forEach(System.out::println);


    }
}
