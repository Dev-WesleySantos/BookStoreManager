package com.wesleysantos.bookstoremanager.utils;

import com.github.javafaker.Faker;
import com.wesleysantos.bookstoremanager.dto.AuthorDTO;
import com.wesleysantos.bookstoremanager.entity.Author;

public class AuthorUtils {

    private static final Faker faker = Faker.instance();

    public static AuthorDTO createFakeAuthorDTO(){
        return AuthorDTO.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Author createFakeAuthor() {
        return Author.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }
}
