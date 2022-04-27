package com.sample.demo.dao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;


class FakePersonDataAccessServiceTest {

    @Test
    void deletePersonByIDTest() {
        FakePersonDataAccessService fakePersonDataAccessService = new FakePersonDataAccessService();
        int result = fakePersonDataAccessService.deletePersonByID(UUID.randomUUID());
        Assertions.assertEquals(0, result);
    }
}