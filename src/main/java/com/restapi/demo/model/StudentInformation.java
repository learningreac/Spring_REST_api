package com.restapi.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
@Table(name = "Student")
public class StudentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final int id;

        @Column(name = "Student_name")
        private final String name;

        @Column(name = "Student_age")
        private final Long age;
}
