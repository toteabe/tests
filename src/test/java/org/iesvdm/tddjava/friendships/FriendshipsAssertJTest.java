package org.iesvdm.tddjava.friendships;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.empty;

public class FriendshipsAssertJTest {

    Friendships friendships;

    @BeforeEach
    public void before() {
        friendships = new Friendships();
        friendships.makeFriends("Joe", "Audrey");
        friendships.makeFriends("Joe", "Peter");
        friendships.makeFriends("Joe", "Michael");
        friendships.makeFriends("Joe", "Britney");
        friendships.makeFriends("Joe", "Paul");
    }

    @Test
    public void alexDoesNotHaveFriends() {
        assertThat(friendships.getFriendsList("Alex")).isEmpty();
    }

    @Test
    public void joeHas5Friends() {
        assertThat(friendships.getFriendsList("Joe"))
                .hasSize(5)
                .containsOnly("Audrey", "Peter", "Michael", "Britney", "Paul");
    }

}
