package com.example.ritesh.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

    public static List<String> getList(List<Optional<String>> strings){
       return strings.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }
}
