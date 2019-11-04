package com.springbootvalidations.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

    @AssertTrue
    private boolean working;

    @Size(min = 10, max = 200, message
            = "About Me must be between 10 and 200 characters")
    private String aboutMe;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 60, message = "Age should not be greater than 60")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

    @Positive
    private int marks;

    @PositiveOrZero
    private int numberOfChildren;

    @Negative
    private int negative;

    @NegativeOrZero
    private int negativeOrZero;

    @Future
    private Date future;

    @Past
    private Date past;

    @PastOrPresent
    private Date pastOrPresent;

    @FutureOrPresent
    private Date futureOrPresent;

    @Pattern(regexp="^[0-9]*")
    private String pattern;


}
