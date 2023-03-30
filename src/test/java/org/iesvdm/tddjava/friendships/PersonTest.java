package org.iesvdm.tddjava.friendships;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void testGetFriends() throws Exception {
        Person p = new Person("Joe");
        assertThat(p.getFriends()).isEmpty();
    }

    @Test
    public void testAddFriend() throws Exception {
        Person p = new Person("Joe");
        p.addFriend("Ralph");
        p.addFriend("Kate");
        p.addFriend("Ralph");

        assertThat(p.getFriends()).hasSize(2).containsExactly("Ralph", "Kate");

    }
}