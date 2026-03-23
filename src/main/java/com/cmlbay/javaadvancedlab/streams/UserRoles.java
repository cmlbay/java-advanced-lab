package com.cmlbay.javaadvancedlab.streams;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public record UserRoles(Long id, String name, List<String> roles) {
}
