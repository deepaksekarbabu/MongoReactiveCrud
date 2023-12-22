package com.deepak.mongoreactive.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user")
@Getter
@Setter
@ToString(exclude = {"firstName", "phoneNumber", "email"})
@EqualsAndHashCode
@JsonFormat
@Builder
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
    private List<AppointmentDetails> appointmentDetails;

}