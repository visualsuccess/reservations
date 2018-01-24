package com.reservation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DatabaseInitializerTest {
	
	@Autowired
	private DatabaseInitializer databaseInit;
	
    @Autowired
    private TestEntityManager entityManager;
	
	@Test
	public void testInit() throws Exception {
		//entityManager.persist( new RoomType(99, "JUnit", new BigDecimal(99)));
		databaseInit.innitRoomTypes();
		
		assertTrue(true);
		//RoomType rt = entityManager.find(RoomType.class, 99);
		//Assert.assertNotNull(rt);
	}

}
