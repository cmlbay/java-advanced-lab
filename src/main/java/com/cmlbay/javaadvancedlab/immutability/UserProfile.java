package com.cmlbay.javaadvancedlab.immutability;

import java.util.List;
import java.util.Objects;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-17
 */
public final class UserProfile {
    private final Long id;
    private final String fullName;
    private final List<String> roles;

    public UserProfile(Long id, String fullName, List<String> roles) {
        this.id = Objects.requireNonNull(id,"id cannot be null");
        this.fullName = Objects.requireNonNull(fullName,"fullName cannot be null");
        this.roles = List.copyOf(Objects.requireNonNull(roles, "roles cannot be null"));
    }

    public Long getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }

    public List<String> getRoles() {
        return roles;
    }
}
