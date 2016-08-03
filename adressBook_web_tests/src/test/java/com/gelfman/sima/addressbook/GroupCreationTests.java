package com.gelfman.sima.addressbook;


import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        goToGrooupPage ();
        initGroupCreation ();
        fellGroupForm ( new GroupData ( "test1", "test2", "test3" ) );
        subitGroupCreation ();
        returnToGroupPage ();
    }

}
