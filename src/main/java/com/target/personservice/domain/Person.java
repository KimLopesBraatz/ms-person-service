package com.target.personservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "samaia", name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", columnDefinition = "BIGINT", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR", length = 60, nullable = false)
    private String name;

    @Column(name = "itin", columnDefinition = "VARCHAR", nullable = false)
    private String itin;

    @Column(name = "email", columnDefinition = "VARCHAR", length = 60, nullable = false)
    private String email;

    @Column(name = "date_of_birth", columnDefinition = "DATE", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "created_in", columnDefinition = "DATE", nullable = false)
    private Date createdIn;
}
