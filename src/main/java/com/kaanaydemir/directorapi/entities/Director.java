package com.kaanaydemir.directorapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Document(collection = "directors")
public class Director {

    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Address address;
    private List<Integer> movies;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getMovies() {
        return movies;
    }

    public void setMovies(List<Integer> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Director director = (Director) o;

        if (!id.equals(director.id)) return false;
        if (!email.equals(director.email)) return false;
        if (!name.equals(director.name)) return false;
        if (!surname.equals(director.surname)) return false;
        if (!birthDate.equals(director.birthDate)) return false;
        if (!address.equals(director.address)) return false;
        return Objects.equals(movies, director.movies);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + (movies != null ? movies.hashCode() : 0);
        return result;
    }
}
