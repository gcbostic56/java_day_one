
package com.win.junit;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HiFriendTest {
    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        assertEquals("Hi Larry Sprinkle!", HiFriend.hiFriend("Larry Sprinkle"));
    }
}

// public class HiFriendTest {
//     //This is a code comment HELLO THERE!
//     public static void main(String[] args) {
//         HelloFriend();
//         //this does the thing
//     }
//     public static void HelloFriend() {
//         String s1 = "Cameron Bostic";
//         System.out.println("Hello " + s1 + "!");
//         //ooop
//     }
// }
