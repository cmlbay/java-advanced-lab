package com.cmlbay.javaadvancedlab.equality;

import java.util.Objects;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-13
 */
public class BrokenEmployee {
    private final Long id;
    private final String email;

    public BrokenEmployee(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BrokenEmployee that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email);
    }

}
