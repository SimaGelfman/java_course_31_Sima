package com.gelfman.sima.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
       goToGrooupPage ();
       selectGroup ();
       deleteSelectedGroups ();
       returnToGroupPage ();
    }

}
