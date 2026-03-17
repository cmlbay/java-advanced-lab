package com.cmlbay.javaadvancedlab.immutability;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-17
 */
public class UserProfileTest {

    @Test
    void constructor_shouldDefensivelyCopyIncomingList(){
        List<String> roles = new ArrayList<>();
        roles.add("ADMIN");

        UserProfile profile = new UserProfile(1L,"Cemal Bayraktar",roles);
        roles.add("SUPER_ADMIN");

        assertEquals(1,profile.getRoles().size());
        assertEquals("ADMIN",profile.getRoles().getFirst());
    }

    @Test
    void getter_shouldReturnUnmodifiableContent(){
        UserProfile profile = new UserProfile(
                1L,
                "Cemal Bayraktar",
                List.of("ADMIN","USER")
        );

        assertThrows(UnsupportedOperationException.class, () ->
                profile.getRoles().add("NEW_ROLE")
        );
    }

}
